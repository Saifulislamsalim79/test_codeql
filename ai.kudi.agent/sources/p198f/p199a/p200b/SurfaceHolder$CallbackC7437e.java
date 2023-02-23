package p198f.p199a.p200b;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import o.a.a;
/* compiled from: CameraPreview.kt */
/* renamed from: f.a.b.e */
/* loaded from: classes2.dex */
public final class SurfaceHolder$CallbackC7437e extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: A */
    private int f17614A;

    /* renamed from: B */
    private C7438f f17615B;

    /* renamed from: C */
    private final Map<byte[], ByteBuffer> f17616C;

    /* renamed from: c */
    private Camera f17617c;

    /* renamed from: d */
    private Camera.Size f17618d;

    /* renamed from: e */
    private Camera.Size f17619e;

    /* renamed from: f */
    private int f17620f;

    /* renamed from: w */
    private final float f17621w;

    /* renamed from: x */
    private final int f17622x;

    /* renamed from: y */
    private RunnableC7443h f17623y;

    /* renamed from: z */
    private Thread f17624z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceHolder$CallbackC7437e(Context context) {
        super(context);
        l.f(context, "context");
        this.f17620f = 1;
        this.f17621w = 30.0f;
        this.f17622x = 17;
        this.f17616C = new IdentityHashMap();
        getHolder().addCallback(this);
        m18741a();
    }

    /* renamed from: a */
    private final void m18741a() {
        Camera open;
        m18736f();
        try {
            if (m18738d()) {
                open = Camera.open(this.f17620f);
            } else {
                open = Camera.open();
            }
            this.f17617c = open;
            l.d(open);
            setProcessingRunnable(new RunnableC7443h(open, this.f17616C));
            this.f17624z = new Thread(this.f17623y);
            RunnableC7443h runnableC7443h = this.f17623y;
            if (runnableC7443h != null) {
                runnableC7443h.m18712b(true);
            }
            Thread thread = this.f17624z;
            if (thread != null) {
                thread.start();
            }
            Camera camera = this.f17617c;
            if (camera == null) {
                return;
            }
            int[] m18735g = m18735g(camera);
            if (m18735g != null) {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setPreviewFpsRange(m18735g[0], m18735g[1]);
                parameters.setPreviewFormat(this.f17622x);
                m18734h(camera, this.f17620f);
                camera.setParameters(parameters);
                return;
            }
            throw new IOException("Could not find suitable preview frames per second range.");
        } catch (Exception e) {
            a.d(e);
        }
    }

    /* renamed from: b */
    private final byte[] m18740b(Camera.Size size) {
        double bitsPerPixel = size.height * size.width * ImageFormat.getBitsPerPixel(this.f17622x);
        Double.isNaN(bitsPerPixel);
        byte[] bArr = new byte[((int) Math.ceil(bitsPerPixel / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Map<byte[], ByteBuffer> map = this.f17616C;
        l.e(wrap, "buffer");
        map.put(bArr, wrap);
        return bArr;
    }

    /* renamed from: c */
    private final Camera.Size m18739c(List<? extends Camera.Size> list, int i, int i2) {
        if (list == null) {
            return null;
        }
        double d = Double.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        double d2 = i;
        double d3 = i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            a.a("Current height: " + size2.height + ", Width: " + size2.width, new Object[0]);
            double d5 = (double) size2.width;
            double d6 = (double) size2.height;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double abs = Math.abs(d4 - (d5 / d6));
            if (abs < d && Math.abs(i - size2.width) < i3) {
                i3 = Math.abs(i - size2.width);
                size = size2;
                d = abs;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Optimal height: ");
        sb.append(size == null ? null : Integer.valueOf(size.height));
        sb.append(", Width: ");
        sb.append(size != null ? Integer.valueOf(size.width) : null);
        a.a(sb.toString(), new Object[0]);
        return size;
    }

    /* renamed from: g */
    private final int[] m18735g(Camera camera) {
        int i = (int) (this.f17621w * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (abs < i2) {
                iArr = iArr2;
                i2 = abs;
            }
        }
        return iArr;
    }

    /* renamed from: h */
    private final void m18734h(Camera camera, int i) {
        int i2;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            int i3 = 0;
            if (rotation != 0) {
                if (rotation == 1) {
                    i3 = 90;
                } else if (rotation == 2) {
                    i3 = 180;
                } else if (rotation == 3) {
                    i3 = 270;
                }
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 1) {
                int i4 = (cameraInfo.orientation + i3) % 360;
                this.f17614A = i4;
                i2 = (360 - i4) % 360;
            } else {
                i2 = ((cameraInfo.orientation - i3) + 360) % 360;
                this.f17614A = i2;
            }
            camera.setDisplayOrientation(i2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: i */
    private final void m18733i() {
        if (getHolder().getSurface() == null) {
            return;
        }
        try {
            Camera camera = this.f17617c;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception unused) {
        }
        try {
            Camera camera2 = this.f17617c;
            if (camera2 == null) {
                return;
            }
            Camera.Parameters parameters = camera2.getParameters();
            final Camera.Size size = this.f17618d;
            if (size != null) {
                Camera.Size size2 = this.f17619e;
                if (size2 == null) {
                    size2 = size;
                }
                parameters.setPreviewSize(size.width, size.height);
                parameters.setPictureSize(size2.width, size2.height);
                camera2.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: f.a.b.a
                    @Override // android.hardware.Camera.PreviewCallback
                    public final void onPreviewFrame(byte[] bArr, Camera camera3) {
                        SurfaceHolder$CallbackC7437e.m18732j(size, this, bArr, camera3);
                    }
                });
                camera2.addCallbackBuffer(m18740b(size));
                camera2.addCallbackBuffer(m18740b(size));
                camera2.addCallbackBuffer(m18740b(size));
                camera2.addCallbackBuffer(m18740b(size));
                camera2.setParameters(parameters);
                camera2.setPreviewDisplay(getHolder());
                camera2.startPreview();
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable th) {
            a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m18732j(Camera.Size size, SurfaceHolder$CallbackC7437e surfaceHolder$CallbackC7437e, byte[] bArr, Camera camera) {
        l.f(size, "$previewSize");
        l.f(surfaceHolder$CallbackC7437e, "this$0");
        C7442g c7442g = new C7442g(size.width, size.height, surfaceHolder$CallbackC7437e.f17614A);
        RunnableC7443h runnableC7443h = surfaceHolder$CallbackC7437e.f17623y;
        if (runnableC7443h == null) {
            return;
        }
        l.e(camera, "camera");
        runnableC7443h.m18710d(bArr, camera, c7442g);
    }

    private final void setProcessingRunnable(RunnableC7443h runnableC7443h) {
        this.f17623y = runnableC7443h;
        C7438f c7438f = this.f17615B;
        if (c7438f != null) {
            a.a(l.m("faceDetectionProcessor: ", c7438f), new Object[0]);
            RunnableC7443h runnableC7443h2 = this.f17623y;
            if (runnableC7443h2 == null) {
                return;
            }
            runnableC7443h2.m18711c(this.f17615B);
        }
    }

    /* renamed from: d */
    public final boolean m18738d() {
        boolean z;
        boolean z2;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras > 0) {
            int i = 0;
            z = false;
            z2 = false;
            while (true) {
                int i2 = i + 1;
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                int i3 = cameraInfo.facing;
                if (i3 == 1) {
                    z = true;
                } else if (i3 == 0) {
                    z2 = true;
                }
                if (i2 >= numberOfCameras) {
                    break;
                }
                i = i2;
            }
        } else {
            z = false;
            z2 = false;
        }
        return z && z2;
    }

    /* renamed from: f */
    public final void m18736f() {
        RunnableC7443h runnableC7443h = this.f17623y;
        if (runnableC7443h != null) {
            runnableC7443h.m18712b(false);
        }
        try {
            Thread thread = this.f17624z;
            if (thread != null) {
                thread.join();
            }
            this.f17624z = null;
            Camera camera = this.f17617c;
            if (camera != null) {
                camera.stopPreview();
            }
            Camera camera2 = this.f17617c;
            if (camera2 != null) {
                camera2.release();
            }
            this.f17617c = null;
        } catch (InterruptedException unused) {
        }
        this.f17616C.clear();
    }

    public final C7438f getFaceDetectionProcessor() {
        return this.f17615B;
    }

    /* renamed from: k */
    public final void m18731k() {
        this.f17620f = this.f17620f == 1 ? 0 : 1;
        m18741a();
        m18733i();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|3)|(8:38|6|7|(1:32)|(1:11)|(1:13)|14|(4:16|(1:18)(1:26)|19|(2:21|22)(2:24|25))(2:27|28))|5|6|7|(1:9)(2:29|32)|(0)|(0)|14|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.getSuggestedMinimumWidth()
            int r4 = android.view.View.resolveSize(r0, r4)
            int r0 = r3.getSuggestedMinimumWidth()
            int r5 = android.view.View.resolveSize(r0, r5)
            r0 = 0
            android.hardware.Camera r1 = r3.f17617c     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
        L15:
            r1 = r0
            goto L22
        L17:
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L1e
            goto L15
        L1e:
            java.util.List r1 = r1.getSupportedPreviewSizes()     // Catch: java.lang.Throwable -> L15
        L22:
            android.hardware.Camera r2 = r3.f17617c     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L27
            goto L34
        L27:
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L2e
            goto L34
        L2e:
            java.util.List r0 = r2.getSupportedPictureSizes()     // Catch: java.lang.Throwable -> L33
            goto L34
        L33:
        L34:
            if (r1 == 0) goto L3c
            android.hardware.Camera$Size r1 = r3.m18739c(r1, r4, r5)
            r3.f17618d = r1
        L3c:
            if (r0 == 0) goto L44
            android.hardware.Camera$Size r0 = r3.m18739c(r0, r4, r5)
            r3.f17619e = r0
        L44:
            android.hardware.Camera$Size r0 = r3.f17618d
            if (r0 == 0) goto L97
            kotlin.e0.d.l.d(r0)
            int r0 = r0.height
            android.hardware.Camera$Size r1 = r3.f17618d
            kotlin.e0.d.l.d(r1)
            int r1 = r1.width
            if (r0 < r1) goto L66
            android.hardware.Camera$Size r0 = r3.f17618d
            kotlin.e0.d.l.d(r0)
            int r0 = r0.height
            float r0 = (float) r0
            android.hardware.Camera$Size r1 = r3.f17618d
            kotlin.e0.d.l.d(r1)
            int r1 = r1.width
            goto L75
        L66:
            android.hardware.Camera$Size r0 = r3.f17618d
            kotlin.e0.d.l.d(r0)
            int r0 = r0.width
            float r0 = (float) r0
            android.hardware.Camera$Size r1 = r3.f17618d
            kotlin.e0.d.l.d(r1)
            int r1 = r1.height
        L75:
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = (float) r4
            float r0 = r0 * r1
            float r5 = (float) r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L92
            android.hardware.Camera$Size r4 = r3.f17618d
            kotlin.e0.d.l.d(r4)
            int r4 = r4.height
            float r4 = (float) r4
            float r5 = r5 / r4
            float r0 = r0 * r5
            float r1 = r1 * r5
            int r4 = (int) r1
            int r5 = (int) r0
            r3.setMeasuredDimension(r4, r5)
            goto L9a
        L92:
            int r5 = (int) r0
            r3.setMeasuredDimension(r4, r5)
            goto L9a
        L97:
            r3.setMeasuredDimension(r4, r5)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p198f.p199a.p200b.SurfaceHolder$CallbackC7437e.onMeasure(int, int):void");
    }

    public final void setFaceDetectionProcessor(C7438f c7438f) {
        this.f17615B = c7438f;
        RunnableC7443h runnableC7443h = this.f17623y;
        if (runnableC7443h == null) {
            return;
        }
        runnableC7443h.m18711c(c7438f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        l.f(surfaceHolder, "holder");
        try {
            m18733i();
        } catch (Throwable th) {
            a.d(th);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        l.f(surfaceHolder, "holder");
        if (this.f17617c == null) {
            m18741a();
        }
        m18733i();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l.f(surfaceHolder, "holder");
        m18736f();
        C7438f c7438f = this.f17615B;
        if (c7438f == null) {
            return;
        }
        c7438f.m18718m();
    }
}
