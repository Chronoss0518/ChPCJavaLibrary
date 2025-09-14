package ChPCJavaLibrary.PC;

import java.awt.Graphics;
import java.util.*;

import ChPCJavaLibrary.PC.FrameInterface.ChFramePainter;
import ChPCJavaLibrary.PC.FrameInterface.ChFrameUpdater;

public class ChFrameBase implements ChFramePainter, ChFrameUpdater {

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

    List<ChFrameBase> list = new ArrayList<ChFrameBase>();
}
