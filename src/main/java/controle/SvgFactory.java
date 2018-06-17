package controle;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SvgFactory {
    
    private final File modeloSvg;
    
    public SvgFactory(){
        modeloSvg = new File("modelo.svg");
    }
    
    public File criarSvg(String imgPath, Geometry geomA, Geometry geomB) throws IOException{
        File novoSvg = new File(imgPath);
        if(!novoSvg.exists()){
            novoSvg.createNewFile();
        }
        
        FileReader fileReader = new FileReader(modeloSvg);
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fw = new FileWriter(novoSvg, false);
        PrintWriter pw = new PrintWriter(fw);

        copiarNLinhas(pw, reader, 3);

        ViewBox viewBox = new ViewBox(geomA, geomB);
        pw.write(viewBox.getViewBox());        

        copiarNLinhas(pw, reader, 2);

        pw.write(getSvg(geomA));
        
        copiarNLinhas(pw, reader, 2);

        pw.write(getSvg(geomB));        

        copiarNLinhas(pw, reader, 2);

        reader.close();
        pw.close();
        return novoSvg;
    }

    public static String getSvg(Geometry geometria) {
        StringBuilder svg = new StringBuilder();

        Coordinate[] coordinates = geometria.getCoordinates();

        svg.append("M");
        svg.append((coordinates[0].x));
        svg.append(" ");
        svg.append((coordinates[0].y));

        svg.append(" ");

        for (Coordinate c : coordinates) {
            svg.append("L");
            svg.append(c.x);
            svg.append(" ");
            svg.append(c.y);
            svg.append(" ");
        }

        svg.append("Z");

        return svg.toString();
    }
    
     private void copiarNLinhas(PrintWriter pw, BufferedReader reader, int quant) throws IOException {
        for (int i = 0; i < quant; i++) {
            pw.println(reader.readLine());
        }
    }

}
