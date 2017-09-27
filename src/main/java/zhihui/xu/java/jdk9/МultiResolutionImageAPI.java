package zhihui.xu.java.jdk9;

import java.awt.*;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.BufferedImage;
import java.awt.image.MultiResolutionImage;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class МultiResolutionImageAPI {
    public static void main(String[] args) {
        BufferedImage[] resolutionVariants = null;
        int baseIndex =0;
        MultiResolutionImage bmrImage  = new BaseMultiResolutionImage(baseIndex, resolutionVariants);
        Image testRVImage = bmrImage.getResolutionVariant(16, 16);
        //assertSame("Images should be the same", testRVImage, resolutionVariants[3]);
    }
}
