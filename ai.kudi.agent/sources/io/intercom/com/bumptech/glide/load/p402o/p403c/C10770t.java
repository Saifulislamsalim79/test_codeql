package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: TransformationUtils.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.t */
/* loaded from: classes3.dex */
public final class C10770t {

    /* renamed from: a */
    private static final Paint f24615a = new Paint(6);

    /* renamed from: b */
    private static final Paint f24616b;

    /* renamed from: c */
    private static final List<String> f24617c;

    /* renamed from: d */
    private static final Lock f24618d;

    /* compiled from: TransformationUtils.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.t$a  reason: invalid class name */
    /* loaded from: classes3.dex */
    private static final class locksLockC10771a implements Lock {
        locksLockC10771a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        new Paint(7);
        List<String> asList = Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098");
        f24617c = asList;
        f24618d = (asList.contains(Build.MODEL) && Build.VERSION.SDK_INT == 22) ? new ReentrantLock() : new locksLockC10771a();
        Paint paint = new Paint(7);
        f24616b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m12380a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f24618d.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f24615a);
            m12377d(canvas);
        } finally {
            f24618d.unlock();
        }
    }

    /* renamed from: b */
    public static Bitmap m12379b(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap bitmap2 = interfaceC10581e.get(i, i2, m12373h(bitmap));
        m12368m(bitmap, bitmap2);
        m12380a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: c */
    public static Bitmap m12378c(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return m12376e(interfaceC10581e, bitmap, i, i2);
    }

    /* renamed from: d */
    private static void m12377d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: e */
    public static Bitmap m12376e(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmap2 = interfaceC10581e.get((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), m12373h(bitmap));
        m12368m(bitmap, bitmap2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmap2.getWidth() + "x" + bitmap2.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m12380a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: f */
    public static Lock m12375f() {
        return f24618d;
    }

    /* renamed from: g */
    public static int m12374g(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    private static Bitmap.Config m12373h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: i */
    static void m12372i(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: j */
    public static boolean m12371j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: k */
    public static Bitmap m12370k(Bitmap bitmap, int i) {
        if (i != 0) {
            try {
                Matrix matrix = new Matrix();
                matrix.setRotate(i);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e) {
                if (Log.isLoggable("TransformationUtils", 6)) {
                    Log.e("TransformationUtils", "Exception when trying to orient image", e);
                    return bitmap;
                }
                return bitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: l */
    public static Bitmap m12369l(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i) {
        if (m12371j(i)) {
            Matrix matrix = new Matrix();
            m12372i(i, matrix);
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            Bitmap bitmap2 = interfaceC10581e.get(Math.round(rectF.width()), Math.round(rectF.height()), m12373h(bitmap));
            matrix.postTranslate(-rectF.left, -rectF.top);
            m12380a(bitmap, bitmap2, matrix);
            return bitmap2;
        }
        return bitmap;
    }

    /* renamed from: m */
    public static void m12368m(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
