package ChPCJavaLibrary.PC;

import java.awt.Graphics;
import java.util.*;

import ChPCJavaLibrary.PC.FrameInterface.FramePainter;
import ChPCJavaLibrary.PC.FrameInterface.FrameUpdater;

public class FrameBase implements FramePainter, FrameUpdater {

    @Override
    public void Paint(Graphics _g)
    {
        for(int i = 0 ; i < list.size();i++)
        {
            var frame = list.get(i);
            if(frame == null)continue;
            frame.Paint(_g);
        }
    }

    @Override
    public void Update(Graphics _g)
    {
        for(int i = 0 ; i < list.size();i++)
        {
            var frame = list.get(i);
            if(frame == null)continue;
            frame.Update(_g);
        }
    }

    List<FrameBase> list = new ArrayList<FrameBase>();
}
