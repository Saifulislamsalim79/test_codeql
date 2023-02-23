package p198f.p199a.p200b;

import android.hardware.Camera;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13666w;
import kotlin.e0.d.l;
/* compiled from: FrameProcessingRunnable.kt */
/* renamed from: f.a.b.h */
/* loaded from: classes2.dex */
public final class RunnableC7443h implements Runnable {

    /* renamed from: A */
    private C7438f f17644A;

    /* renamed from: c */
    private final Camera f17645c;

    /* renamed from: d */
    private final Map<byte[], ByteBuffer> f17646d;

    /* renamed from: e */
    private final ReentrantLock f17647e;

    /* renamed from: f */
    private final Condition f17648f;

    /* renamed from: w */
    private final ReentrantLock f17649w;

    /* renamed from: x */
    private boolean f17650x;

    /* renamed from: y */
    private ByteBuffer f17651y;

    /* renamed from: z */
    private C7442g f17652z;

    public RunnableC7443h(Camera camera, Map<byte[], ByteBuffer> map) {
        l.f(camera, "camera");
        l.f(map, "bytesToByteBuffer");
        this.f17645c = camera;
        this.f17646d = map;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f17647e = reentrantLock;
        this.f17648f = reentrantLock.newCondition();
        this.f17649w = new ReentrantLock();
        this.f17650x = true;
    }

    /* renamed from: a */
    public final C7438f m18713a() {
        return this.f17644A;
    }

    /* renamed from: b */
    public final void m18712b(boolean z) {
        ReentrantLock reentrantLock = this.f17647e;
        reentrantLock.lock();
        try {
            this.f17650x = z;
            this.f17648f.signalAll();
            C13666w c13666w = C13666w.f30112a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final void m18711c(C7438f c7438f) {
        this.f17644A = c7438f;
    }

    /* renamed from: d */
    public final void m18710d(byte[] bArr, Camera camera, C7442g c7442g) {
        l.f(camera, "camera");
        l.f(c7442g, "metaData");
        ReentrantLock reentrantLock = this.f17647e;
        reentrantLock.lock();
        try {
            if (this.f17651y != null) {
                ByteBuffer byteBuffer = this.f17651y;
                l.d(byteBuffer);
                camera.addCallbackBuffer(byteBuffer.array());
                this.f17651y = null;
            }
            Map<byte[], ByteBuffer> map = this.f17646d;
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
            if (!map.containsKey(bArr)) {
                Log.d("FrameProcessingRunnable", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                return;
            }
            this.f17651y = this.f17646d.get(bArr);
            this.f17652z = c7442g;
            this.f17648f.signalAll();
            C13666w c13666w = C13666w.f30112a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            ReentrantLock reentrantLock = this.f17647e;
            reentrantLock.lock();
            while (this.f17650x && this.f17651y == null) {
                try {
                    this.f17648f.await();
                } catch (InterruptedException e) {
                    Log.d("FrameProcessingRunnable", "Frame processing loop terminated.", e);
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (!this.f17650x) {
                return;
            }
            ByteBuffer byteBuffer = this.f17651y;
            l.d(byteBuffer);
            C7442g c7442g = this.f17652z;
            l.d(c7442g);
            this.f17651y = null;
            C13666w c13666w = C13666w.f30112a;
            try {
                ReentrantLock reentrantLock2 = this.f17649w;
                reentrantLock2.lock();
                try {
                    C7438f m18713a = m18713a();
                    if (m18713a != null) {
                        l.d(byteBuffer);
                        l.d(c7442g);
                        m18713a.m18724g(byteBuffer, c7442g);
                        C13666w c13666w2 = C13666w.f30112a;
                    }
                    reentrantLock2.unlock();
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                    break;
                }
            } catch (Exception e2) {
                Log.e("FrameProcessingRunnable", "Exception thrown from receiver.", e2);
            } finally {
                Camera camera = this.f17645c;
                l.d(byteBuffer);
                camera.addCallbackBuffer(byteBuffer.array());
            }
        }
    }
}
