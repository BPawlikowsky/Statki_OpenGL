package com.bartskys.statki.level;

import com.bartskys.statki.graphics.Texture;
import com.bartskys.statki.graphics.VertexArray;
import com.bartskys.statki.math.Matrix4f;
import com.bartskys.statki.math.Vector3f;

public class Pipe {

      private Vector3f position = new Vector3f();
      private Matrix4f ml_matrix;
      
      private static float width = 1.5f, height = 8.0f;
      private static Texture texture;
      private static VertexArray mesh;

      public static void create() {

            float[] vertices = {
                     0.0f,   0.0f, 0.1f,
                     0.0f, height, 0.1f,
                    width, height, 0.1f,
                    width,   0.0f, 0.1f,

            };

            byte[] indices = {
                    0, 1, 2,
                    2, 3, 0
            };

            float[] tcs = {
                    0, 1,
                    0, 0,
                    1, 0,
                    1, 1,
            };

            mesh = new VertexArray(vertices, indices, tcs);
            texture = new Texture("res/pipe.png");
      }

      public Pipe(float x, float y) {
            position.x = x;
            position.y = y;
            ml_matrix = Matrix4f.translate(position);
      }

      public float getX() {
            return position.x;
      }

      public float getY() {
            return position.y;
      }

      public static Texture getTexture() {
            return texture;
      }

      public static VertexArray getMesh() {
            return mesh;
      }

      public Matrix4f getModelMatrix() {
            return ml_matrix;
      }

      public static float getWidth() {
            return width;
      }

      public static float getHeight() {
            return height;
      }
}
