package ChPCJavaLibrary.PC;

import java.awt.*;
import java.awt.image.*;

import ChPCJavaLibrary.PC.FrameInterface.FramePainter;

public class RenderTarget extends BaseImage implements FramePainter
{
    public void Init(int _w,int _h)
    {
        Release();
        SetImage(new BufferedImage(_w,_h,BufferedImage.TYPE_INT_ARGB));
    }

    public Graphics GetGraphics()
    {
        var bi = (BufferedImage)GetImage();
        if(bi == null)return null;
        return bi.createGraphics();
    }

    @Override
    public void Paint(Graphics _g)
    {
        var bi = (BufferedImage)GetImage();
        if(bi == null)return;
        _g.drawImage(bi, 0, 0, null);

    }
    
}
