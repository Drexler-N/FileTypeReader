import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {

        if(args.length < 1){
            throw new RuntimeException("Directory Not specified");
        }
        else{
            String pathname = args[0];

            File[] files = new File(pathname).listFiles();
            
            FilenameFilter filenameFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    String filename = dir.getName();
                    return filename.contains(name);
                }
            };


            for(File readfile: files){
                  if(filenameFilter.accept(readfile, "txt")){
                    System.out.println(readfile.getName());
                }
              }
        }

    }
}