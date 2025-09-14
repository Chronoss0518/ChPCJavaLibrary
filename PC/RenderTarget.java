package ChPCJavaLibrary.PC;

import java.awt.*;
import java.awt.image.*;

import ChPCJavaLibrary.PC.FrameInterface.ChFramePainter;

public class RenderTarget extends ChBaseImage implements ChFramePainter {
    
    public void Init(int _w,int _h)
    {
        super.Release();
        SetImage(new BufferedImage(_w,_h,BufferedImage.TYPE_INT_ARGB));
    }

    @Override
    public void Paint(Graphics _g)
    {
        _g.drawImage(GetImage(), 0, 0, null);
    }

}
