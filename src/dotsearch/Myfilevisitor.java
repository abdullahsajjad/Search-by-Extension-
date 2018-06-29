/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotsearch;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AbdullahSajjad
 */
public class Myfilevisitor extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFileFailed(Path t, IOException ioe) throws IOException {
        System.out.println(ioe.getMessage());
        return FileVisitResult.CONTINUE;
        //To change body of generated methods, choose Tools | Templates.
            }

    @Override
    public FileVisitResult visitFile(Path t, BasicFileAttributes bfa) throws IOException {
        if(t.getFileName().toString().contains(extension))
        {
            filelist.add(t.toString());
         
        }return FileVisitResult.CONTINUE;
    }

    public Myfilevisitor(String ext) {
        Myfilevisitor.extension=ext;
    }
    public ArrayList<String> Returnfilelist()
    {
        return filelist;
    }
    private final  ArrayList<String> filelist=new ArrayList<String>();
    private static String extension;
}
