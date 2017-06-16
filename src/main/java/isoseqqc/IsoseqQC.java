package isoseqqc;

import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by robinp on 6/16/17.
 */
public class IsoseqQC {

    private String baseDirectory=null;

    private int n_readsOfInsert;
    private int n_5primeReads;
    private int n_3primeReads;
    private int n_polyAreads;
    private int n_filteredShortReads;
    private int n_nonFullLenghtReads;
    private int n_fullLengthReads;
    private int n_fullLengthNonchimericReads;



    public static void main(String args[]) {
        String dir="/home/robinp/data/pbio";
        IsoseqQC iqc = new IsoseqQC(dir);
    }





    public IsoseqQC(String dir) {
        this.baseDirectory=dir;
        String summary=String.format("%s/isoseq_draft.classify_summary.txt",this.baseDirectory);
        inputSummary(summary);
    }



    public void inputSummary(String path) {
        String line=null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
