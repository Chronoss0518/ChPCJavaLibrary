package ChPCJavaLibrary.PC;

import java.awt.*;

import ChPCJavaLibrary.PC.FrameInterface.FramePainter;

public class ImageObject extends BaseImage implements FramePainter
{
    public void Init(String _imagePath)
    {
        super.Release();
        SetImage(Toolkit.getDefaultToolkit().getImage(""));
    }

    @Override
    public void Paint(Graphics _g)
    {
        _g.drawImage(GetImage(), 0, 0, null);
    }

}
