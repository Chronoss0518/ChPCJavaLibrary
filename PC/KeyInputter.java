package ChPCJavaLibrary.PC;

import java.awt.event.*;
import java.util.*;

public class KeyInputter implements KeyListener
{

    public boolean IsPushKeyState(int _vk)
    {
        return pushKeyFlags.get(_vk);
    }

    public String getFlgToString()
    {
        List<Integer> tmp = new ArrayList<Integer>();

        for(int num : VKNums)
        {
            if(pushKeyFlags.get(num))continue;
            tmp.add(num);
        }

        return tmp.toString();
    }

    @Override
    public void keyTyped(KeyEvent _e)
    {
        PutInKey(_e);

        pushKeyFlags.put(_e.getKeyCode(),true);
    }

    @Override
    public void keyPressed(KeyEvent _e)
    {
        PutInKey(_e);
        pushKeyFlags.put(_e.getKeyCode(),false);
    }

    private void PutInKey(KeyEvent _key)
    {
        if(pushKeyFlags.containsKey(_key.getKeyCode()))return;
        
        pushKeyFlags.put(_key.getKeyCode(),true);
    }

    @Override
    public void keyReleased(KeyEvent _e)
    {
        
    }

    private final int[] VKNums = 
    {
        KeyEvent.VK_ALT,KeyEvent.VK_BACK_SPACE,KeyEvent.VK_CAPS_LOCK,KeyEvent.VK_CLEAR,KeyEvent.VK_CONTROL
        ,KeyEvent.VK_DELETE,KeyEvent.VK_DOWN,KeyEvent.VK_END,KeyEvent.VK_ENTER,KeyEvent.VK_ESCAPE
        ,KeyEvent.VK_INSERT,KeyEvent.VK_LEFT,KeyEvent.VK_RIGHT,KeyEvent.VK_SHIFT,KeyEvent.VK_SPACE
        ,KeyEvent.VK_TAB,KeyEvent.VK_UP
        ,KeyEvent.VK_F1,KeyEvent.VK_F2,KeyEvent.VK_F3,KeyEvent.VK_F4,KeyEvent.VK_F5,KeyEvent.VK_F6
        ,KeyEvent.VK_F7,KeyEvent.VK_F8,KeyEvent.VK_F9,KeyEvent.VK_F10,KeyEvent.VK_F11,KeyEvent.VK_F12
        ,KeyEvent.VK_F13,KeyEvent.VK_F14,KeyEvent.VK_F15,KeyEvent.VK_F16,KeyEvent.VK_F17,KeyEvent.VK_F18
        ,KeyEvent.VK_F19,KeyEvent.VK_F20,KeyEvent.VK_F21,KeyEvent.VK_F22,KeyEvent.VK_F23,KeyEvent.VK_F24
        ,KeyEvent.VK_0,KeyEvent.VK_1,KeyEvent.VK_2,KeyEvent.VK_3,KeyEvent.VK_4,KeyEvent.VK_5
        ,KeyEvent.VK_6,KeyEvent.VK_7,KeyEvent.VK_8,KeyEvent.VK_9
        ,KeyEvent.VK_A,KeyEvent.VK_B,KeyEvent.VK_C,KeyEvent.VK_D,KeyEvent.VK_E,KeyEvent.VK_F
        ,KeyEvent.VK_G,KeyEvent.VK_H,KeyEvent.VK_I,KeyEvent.VK_J,KeyEvent.VK_K,KeyEvent.VK_L
        ,KeyEvent.VK_M,KeyEvent.VK_N,KeyEvent.VK_O,KeyEvent.VK_P,KeyEvent.VK_Q,KeyEvent.VK_R
        ,KeyEvent.VK_S,KeyEvent.VK_T,KeyEvent.VK_U,KeyEvent.VK_V,KeyEvent.VK_W,KeyEvent.VK_X
        ,KeyEvent.VK_Y,KeyEvent.VK_Z
    };

    private Map<Integer,Boolean>pushKeyFlags = new HashMap<>();

}
