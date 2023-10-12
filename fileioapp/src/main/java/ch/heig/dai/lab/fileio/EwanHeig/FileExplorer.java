package ch.heig.dai.lab.fileio.EwanHeig;

import java.io.File;
import java.util.HashSet;

public class FileExplorer {
    private final File folder;
    private HashSet<File> knownFiles;

    /**
     * Constructor
     * Memorize the folder to explore and initialize the set of known files.
     * @param folder
     */
    public FileExplorer(String folder) {
        this.folder = new File(folder);
        this.knownFiles = new HashSet<File>();
    }

    /**
     * Get a single new file from the folder.
     * The file must not have been returned before.
     * Use the java.io.file API to get the list of files in the folder.
     * Use the HashSet knownFiles to keep track of the files that have already been returned.
     * @return a new file, or null if there is no new file
     */
    public File getNewFile() {
        // TODO: implement the method body here
        File[] filesList = folder.listFiles();

        if(filesList != null){
            for(File file : filesList){
                //String fileName = file.getName();
                //si le fichier n'as pas encore été retourné
                if(!knownFiles.contains(file)){
                    knownFiles.add(file);
                    return file;
                }
            }
        }

        return null;
    }
}