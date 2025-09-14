package ChPCJavaLibrary.PC;

import java.awt.*;
import java.awt.event.*;
import ChJavaBaseLibrary.Std.*;
import ChJavaBaseLibrary.ClassParts.*;
import ChPCJavaLibrary.PC.FrameInterface.*;

public class WindowFrame extends ChIsInitialiser{
    ///////////////////////////////////////////////////////////////////////////////////
    // InitializeAndRelease//

    public void Init(String _TitleName) {

        if (IsInit())
            return;

        TitleName = _TitleName;
        WindSize = new ChPoint();
        KeyInput = new KeyInputter();
        FPS = 60;
        FPSCount = System.currentTimeMillis();
        BFrame = new ChFrame();
        BFrame.setTitle(TitleName);

        BFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        BFrame.addKeyListener(KeyInput);

        WindSize.x = 500;
        WindSize.y = 500;

        BFrame.setSize(500, 500);
        BFrame.setVisible(true);
        SetInitFlg(true);
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Setter//

    void setTitle(String _TitleName) {

        if (!IsInit())
            return;

        BFrame.setTitle(_TitleName);
    }

    void setWindSize(ChPoint _Size) {

        if (!IsInit())
            return;

        WindSize.SetValue(_Size);

        BFrame.setSize(_Size.x, _Size.y);
    }

    public void setUpdater(FrameUpdater _updater) {
        if (!IsInit())
            return;

        BFrame.setUpdater(_updater);
    }

    public void setPainter(FramePainter _painter) {
        if (!IsInit())
            return;

        BFrame.setPainter(_painter);
    }

    public void setFPS(int _Fps) {
        if (!IsInit())
            return;
        FPS = _Fps;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Getter//

    public String getTitle() {
        if (!IsInit())
            return new String();

        return BFrame.getTitle();
    }

    public ChPoint getWindSize() {
        if (!IsInit())
            return new ChPoint();

        return WindSize;
    }

    public Frame getBaseFrame() {
        if (!IsInit())
            return new Frame();

        return BFrame;
    }

    public KeyInputter getKeyInputter() {
        if (!IsInit())
            return new KeyInputter();
        return KeyInput;
    }

    public int getFPS() {
        if (!IsInit())
            return 0;

        return FPS;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Updater//

    public void Update() {

        long Test = System.currentTimeMillis();
        if (Test - FPSCount < 1000 / FPS)
            return;
        FPSCount = Test;

        BFrame.repaint();
    }
    
    private int FPS = 0;
    private long FPSCount = 0;
    private String TitleName = "";
    private ChFrame BFrame = null;
    protected WindowAdapter adapteraptor = null;
    protected ChPoint WindSize = null;
    protected KeyInputter KeyInput = null;

    class ChFrame extends Frame {
        @Override
        public void update(Graphics _g) {
            super.update(_g);
            if (updater == null)
                return;
            updater.Update(_g);
        }

        @Override
        public void paint(Graphics _g) {
            super.paint(_g);
            if (painter == null)
                return;
            painter.Paint(_g);

        }

        public void SetTItle(String _title)
        {
            if(frame == null)return;
            frame.setTitle(_title);
        }

        public void Repaint()
        {
            if(frame == null)return;
            frame.repaint();
        }

        public void setUpdater(FrameUpdater _updater) {
            updater = _updater;
        }

        public void setPainter(FramePainter _painter) {
            painter = _painter;
        }
        Frame frame = new Frame();
        FrameUpdater updater = null;
        FramePainter painter = null;

    }
}
