package cтруктурные.decorator.Decor_InputStrem;

import java.io.*;

public class LowerCaseInputStrem extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStrem(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if (c == -1) return c;
        else return Character.toLowerCase((char) c);
    }

//    @Override
//    public int read(byte[] b) throws IOException {
//        int res =super.read(b, offset ,len);
//        return super.read(b);
//    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
//        int res =super.read(b, off , len);
        for(int i = off; i<off+len; i++ )
        {
            b[i]=(byte) Character.toLowerCase((char) b[i]);
        }
        return read(b, off , len);
    }

    public static void main(String[] args) throws IOException{
        InputStream in = new LowerCaseInputStrem(
                new BufferedInputStream(
                        new FileInputStream("1.txt")));
        int c;
        while ((c=in.read())!=-1){
            System.out.print((char) c);

        }
        in.close();
    }
}
