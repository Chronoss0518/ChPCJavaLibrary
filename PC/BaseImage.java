package ChPCJavaLibrary.PC;

import java.awt.*;

public class BaseImage 
{
    public void Release()
    {
        if(imageObject == null)return;
        imageObject.flush();
        imageObject = null;
    }

    public int GetWidth()
    {
        if(imageObject == null)return 0;

        return imageObject.getWidth(null);
    }

    public int GetHeight()
    {
        if(imageObject == null)return 0;

        return imageObject.getWidth(null);
    }

    protected void SetImage(Image _image){if(_image != null)imageObject = _image;}
    
    protected Image GetImage(){ return imageObject; }

    private Image imageObject = null;
}