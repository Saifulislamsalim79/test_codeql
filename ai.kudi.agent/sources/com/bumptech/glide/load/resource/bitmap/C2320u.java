package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: TransformationUtils.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
/* loaded from: classes2.dex */
public final class C2320u {

    /* renamed from: a */
    private static final Paint f6730a = new Paint(6);

    /* renamed from: b */
    private static final Paint f6731b;

    /* renamed from: c */
    private static final Set<String> f6732c;

    /* renamed from: d */
    private static final Lock f6733d;

    /* compiled from: TransformationUtils.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.u$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    private static final class locksLockC2321a implements Lock {
        locksLockC2321a() {
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
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f6732c = hashSet;
        f6733d = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new locksLockC2321a();
        Paint paint = new Paint(7);
        f6731b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m33314a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f6733d.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f6730a);
            m33313b(canvas);
        } finally {
            f6733d.unlock();
        }
    }

    /* renamed from: b */
    private static void m33313b(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: c */
    public static Lock m33312c() {
        return f6733d;
    }

    /* renamed from: d */
    public static int m33311d(int i) {
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

    /* renamed from: e */
    private static Bitmap.Config m33310e(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: f */
    static void m33309f(int i, Matrix matrix) {
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

    /* renamed from: g */
    public static boolean m33308g(int i) {
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

    /* renamed from: h */
    public static Bitmap m33307h(InterfaceC2100e interfaceC2100e, Bitmap bitmap, int i) {
        if (m33308g(i)) {
            Matrix matrix = new Matrix();
            m33309f(i, matrix);
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            Bitmap bitmap2 = interfaceC2100e.get(Math.round(rectF.width()), Math.round(rectF.height()), m33310e(bitmap));
            matrix.postTranslate(-rectF.left, -rectF.top);
            bitmap2.setHasAlpha(bitmap.hasAlpha());
            m33314a(bitmap, bitmap2, matrix);
            return bitmap2;
        }
        return bitmap;
    }
}
