package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: com.google.mlkit.vision.common.internal.b */
/* loaded from: classes2.dex */
public class C6968b {
    /* renamed from: a */
    public static int m20421a(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return 3;
                    }
                    StringBuilder sb = new StringBuilder(29);
                    sb.append("Invalid rotation: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m20420b(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    /* renamed from: c */
    public static void m20419c(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i + i;
            fArr[i2] = list.get(i).x;
            fArr[i2 + 1] = list.get(i).y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = i3 + i3;
            list.get(i3).set(fArr[i4], fArr[i4 + 1]);
        }
    }

    /* renamed from: d */
    public static void m20418d(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
