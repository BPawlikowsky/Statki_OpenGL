package com.bartskys.statki.input;

import org.lwjgl.glfw.*;

public class MouseInputPos extends GLFWCursorPosCallback {

      public static double xPos;
      public static double yPos;

      @Override
      public void invoke(long window, double xpos, double ypos) {

            xPos = (xpos / 0.5) + 2.0;
            yPos = (ypos / 0.5) + 2.0;
      }
}
