package cn.edu.ruc.iir.pixels.common.utils;

import java.io.*;
import java.util.Collection;

public class FileUtil
{
    static private FileUtil instance = null;

    private FileUtil()
    {
    }

    public static FileUtil Instance()
    {
        if (instance == null)
        {
            instance = new FileUtil();
        }
        return instance;
    }

    public BufferedReader getReader(String path) throws FileNotFoundException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        return reader;
    }

    public File[] getFiles(String dirPath)
    {
        File dir = new File(dirPath);
        return dir.listFiles();
    }

    public static String readFileToString(String fileName)
    {
        try
        {
            return org.apache.commons.io.FileUtils.
                    readFileToString(new File(fileName));
        } catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static Collection<File> listFiles(String fileName, boolean recursive)
    {
        return org.apache.commons.io.FileUtils.
                listFiles(new File(fileName), null, recursive);
    }

    public static void writeFile(String content, String fileName, boolean append)
    {
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file, append);
             PrintWriter printWriter = new PrintWriter(fw))
        {
            printWriter.print(content);
            printWriter.flush();
        } catch (Exception e)
        {
            LogFactory.Instance().getLog().error("error when writing file: " + fileName, e);
        }
    }

    public static void appendFile(String content, String filename)
            throws IOException
    {
        writeFile(content, filename, true);
    }

    public static void deleteDirectory(String dirName)
    {
        try
        {
            org.apache.commons.io.FileUtils.deleteDirectory(new File(dirName));
        } catch (IOException e)
        {
            LogFactory.Instance().getLog().error("error when deleting dir: " + dirName, e);
        }
    }

    public BufferedWriter getWriter(String path) throws IOException
    {
        return new BufferedWriter(new FileWriter(path));
    }

}
