package ChPCJavaLibrary.PC;

import java.awt.*;
import ChJavaBaseLibrary.ClassParts.*;

public class ChWindowButton  extends ChIsInitialiser {
    public void Init()
    {

    }

    public void SetLabel(String _label)
    {
        button.setLabel(_label);
    }

    public void SetLocation(int _x,int _y)
    {
        button.setLocation(_x, _y);
    }

    public void SetSize(int _w,int _h)
    {
        button.setSize(_w, _h);
    }

    private Button button;
}
