    /*************************************************************************
     *  Compilation:  javac ArtCollage.java
     *  Execution:    java ArtCollage
     *
     *  @author:
     *
     *************************************************************************/

    import java.awt.Color;

    public class ArtCollage 
        {

        private Picture original;

        private Picture collage;

        private int collageDimension;

        private int tileDimension;    

        private String filename;

        public ArtCollage (String filename) 
        {
            this.filename = filename;
    	    collageDimension = 4; 
            tileDimension = 100;
            original = new Picture(filename);
            collage = new Picture(tileDimension * collageDimension, tileDimension * collageDimension);

            for (int tcol = 0; tcol < collageDimension * tileDimension; tcol++)
                for (int trow = 0; trow < collageDimension * tileDimension; trow++)
                    {
                        int scol = tcol * original.width()  / (tileDimension * collageDimension);
                        int srow = trow * original.height() / (tileDimension * collageDimension);
                        Color color = original.get(scol, srow);
                        collage.set(tcol, trow, color);
                    }
        }

        public ArtCollage (String filename, int td, int cd) 
        {
            this.filename = filename;
            collageDimension = cd;
            tileDimension = td;
            original = new Picture(filename);
            collage = new Picture(tileDimension * collageDimension, tileDimension * collageDimension);

            for (int tcol = 0; tcol < cd * td; tcol++)
            {
                for (int trow = 0; trow < cd * td; trow++)
                    {
                        int scol = tcol * original.width()  / (cd * td);
                        int srow = trow * original.height() / (cd * td);
                        Color color = original.get(scol, srow);
                        collage.set(tcol, trow, color);
                    }
            }
        }

        public int getCollageDimension() 
        {
            return collageDimension;
        }

        public int getTileDimension() 
        {
            return tileDimension;
        }

        public Picture getOriginalPicture() 
        {
            return original;
        }

        public Picture getCollagePicture() 
        {
            return collage;
        }

        public void showOriginalPicture() 
        {
            original.show();
        }

        public void showCollagePicture() 
        {
            collage.show();
        }

        public void replaceTile (String filename,  int collageCol, int collageRow) 
        {
            int temp1 = getTileDimension();
            int temp2 = getTileDimension() * collageCol;
            int temp3 = getTileDimension() * collageRow;

            Picture copy = copyPicture(filename, temp1);

            for(int i = 0; i < temp1; i++)
                for(int j = 0; j < temp1; j++)
                {
                    Color color = copy.get(i, j);
                    collage.setRGB(i + temp2, j + temp3, 0);

                    collage.set(i + temp2, j + temp3, color);
                }
        }
        
        public void makeCollage () 
        {

            int temp1 = getTileDimension();
            int temp2 = getCollageDimension();
            int temp3 = 0;
            int temp4 = 0;

            Picture copy = copyPicture(filename, temp1);


            for(int i = 0; i < temp1 * temp2; i++)
                for(int j = 0; j < temp1 * temp2; j++)
                    collage.setRGB(i, j, 0);

            for(int x = 0; x < temp2; x++)
            {
                if(x > 0)
                    temp4 = temp4 + temp1;

                for(int y = 0; y < temp2; y++)
                {
                    if(y > 0)
                        temp3 = temp3 + temp1;

                    for(int i = 0; i < temp1; i++)
                        for(int j = 0; j < temp1; j++)
                        {
                            Color color = copy.get(i, j);
                            collage.set(i + temp3, j + temp4, color);
                        }
                }
                temp3 = 0;
            }
        }

        public void colorizeTile (String component,  int collageCol, int collageRow) 
        {


            int temp1 = getTileDimension();
            int temp2 = getTileDimension() * collageCol;
            int temp3 = getTileDimension() * collageRow;

            if(component == "red")
            {
                for(int i = temp2; i < temp1 + temp2; i++)
                    for(int j = temp3; j < temp1 + temp3; j++)
                    {    
                        Color color = collage.get(i, j);
                        int r = color.getRed();

                        collage.set(i, j, new Color(r, 0, 0));
                    }
            }
            else if(component == "green")
            {
                for(int i = temp2; i < temp1 + temp2; i++)
                    for(int j = temp3; j < temp1 + temp3; j++)
                    {    
                        Color color = collage.get(i, j);
                        int g = color.getGreen();

                        collage.set(i, j, new Color(0, g, 0));
                    }
            }
            else if(component == "blue")
                {
                for(int i = temp2; i < temp1 + temp2; i++)
                    for(int j = temp3; j < temp1 + temp3; j++)
                    {    
                        Color color = collage.get(i, j);
                        int b = color.getBlue();

                        collage.set(i, j, new Color(0, 0, b));
                    }
            }
        }

        public void greyscaleTile (int collageCol, int collageRow) 
        {

            int temp1 = getTileDimension();
            int temp2 = getTileDimension() * collageCol;
            int temp3 = getTileDimension() * collageRow;

            for(int i = 0; i < temp1; i++)
                for(int j = 0; j < temp1; j++)
                {        
                    Color color = collage.get(i + temp2, j + temp3);
                    Color gray  = Luminance.toGray(color);
                    collage.set(i + temp2, j + temp3, gray);
                }
             
        }

        public Picture copyPicture(String filename, int tileDimension)
        {
            Picture copy = new Picture(tileDimension, tileDimension);
            Picture temp = new Picture(filename);

            int td = tileDimension;

            for (int tcol = 0; tcol < td; tcol++)
            {
                for (int trow = 0; trow < td; trow++)
                    {
                        int scol = tcol * temp.width()  / (td);
                        int srow = trow * temp.height() / (td);
                        Color color = temp.get(scol, srow);
                        copy.set(tcol, trow, color);
                    }
            }
            return copy;
        }

        public static void main (String[] args) 
        {

            ArtCollage art = new ArtCollage(args[0],200,4);
            art.makeCollage();
            art.replaceTile(args[1],1,1);
            art.greyscaleTile(1, 0);
            art.replaceTile(args[1],1,3);
            art.colorizeTile("blue", 1, 3);
            art.showCollagePicture();
        }
    }
        