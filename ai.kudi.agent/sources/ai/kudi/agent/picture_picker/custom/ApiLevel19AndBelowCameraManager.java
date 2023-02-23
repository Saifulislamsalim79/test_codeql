package ai.kudi.agent.picture_picker.custom;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ApiLevel19AndBelowCameraManager.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J2\u0010\u0017\u001a\b\u0018\u00010\u0011R\u00020\u00072\u0012\u0010\u0018\u001a\u000e\u0012\b\u0012\u00060\u0011R\u00020\u0007\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0014J\u0006\u0010\u001f\u001a\u00020\rJ\b\u0010 \u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\rH\u0002J\u0006\u0010\"\u001a\u00020\rJ(\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0006\u0010+\u001a\u00020\rJ\u001a\u0010,\u001a\u00020\r2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/picture_picker/custom/ApiLevel19AndBelowCameraManager;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "camera", "Landroid/hardware/Camera;", "cameraFront", "", "onPictureListener", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "pictureCallback", "Landroid/hardware/Camera$PictureCallback;", "previewSize", "Landroid/hardware/Camera$Size;", "safeToTakePicture", "chooseCamera", "findBackFacingCamera", "", "findFrontFacingCamera", "getOptimalPreviewSize", "sizes", "", "w", "h", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "pauseCamera", "refreshCamera", "releaseCamera", "resumeCamera", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", IjkMediaMeta.IJKM_KEY_FORMAT, "width", "height", "surfaceCreated", "surfaceDestroyed", "switchCamera", "takePhoto", "listener", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApiLevel19AndBelowCameraManager extends SurfaceView implements SurfaceHolder.Callback {
    private Camera camera;
    private boolean cameraFront;
    private InterfaceC11767l<? super Bitmap, C13666w> onPictureListener;
    private final Camera.PictureCallback pictureCallback;
    private Camera.Size previewSize;
    private boolean safeToTakePicture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ApiLevel19AndBelowCameraManager(Context context) {
        super(context);
        Log_OC.getArray(context, "context");
        ApiLevel19AndBelowCameraManager$onPictureListener$1 $r2 = ApiLevel19AndBelowCameraManager$onPictureListener$1.INSTANCE;
        this.onPictureListener = $r2;
        this.pictureCallback = new Camera.PictureCallback() { // from class: ai.kudi.agent.picture_picker.custom.Preview$9
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera) {
                ApiLevel19AndBelowCameraManager $r3 = ApiLevel19AndBelowCameraManager.this;
                ApiLevel19AndBelowCameraManager.m40008pictureCallback$lambda0($r3, bArr, camera);
            }
        };
        Camera $r4 = Camera.open();
        this.camera = $r4;
        Log_OC.append($r4);
        $r4.setDisplayOrientation(90);
        SurfaceHolder $r5 = getHolder();
        $r5.addCallback(this);
        SurfaceHolder $r52 = getHolder();
        $r52.setType(3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void chooseCamera() {
        boolean $z0 = this.cameraFront;
        if ($z0) {
            int $i0 = findBackFacingCamera();
            if ($i0 >= 0) {
                Camera $r1 = Camera.open($i0);
                this.camera = $r1;
                Log_OC.append($r1);
                $r1.setDisplayOrientation(90);
                refreshCamera();
                return;
            }
            return;
        }
        int $i02 = findFrontFacingCamera();
        if ($i02 >= 0) {
            Camera $r12 = Camera.open($i02);
            this.camera = $r12;
            Log_OC.append($r12);
            $r12.setDisplayOrientation(90);
            refreshCamera();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int findBackFacingCamera() {
        int $i1 = Camera.getNumberOfCameras();
        if ($i1 <= 0) {
            return -1;
        }
        int $i2 = 0;
        while (true) {
            int $i0 = $i2 + 1;
            Camera.CameraInfo $r1 = new Camera.CameraInfo();
            Camera.getCameraInfo($i2, $r1);
            int $i3 = $r1.facing;
            if ($i3 == 0) {
                this.cameraFront = false;
                return $i2;
            } else if ($i0 >= $i1) {
                return -1;
            } else {
                $i2 = $i0;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int findFrontFacingCamera() {
        int $i1 = Camera.getNumberOfCameras();
        if ($i1 <= 0) {
            return -1;
        }
        int $i2 = 0;
        while (true) {
            int $i0 = $i2 + 1;
            Camera.CameraInfo $r1 = new Camera.CameraInfo();
            Camera.getCameraInfo($i2, $r1);
            int $i3 = $r1.facing;
            if ($i3 == 1) {
                this.cameraFront = true;
                return $i2;
            } else if ($i0 >= $i1) {
                return -1;
            } else {
                $i2 = $i0;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:18:0x0097 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.hardware.Camera.Size getOptimalPreviewSize(java.util.List r26, int r27, int r28) {
        /*
            r25 = this;
            r0 = r28
            double r4 = (double) r0
            r0 = r27
            double r6 = (double) r0
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r6)
            double r6 = r4 / r6
            r8 = 0
            if (r26 != 0) goto L13
            r9 = 0
            return r9
        L13:
            r0 = r26
            java.util.Iterator r10 = r0.iterator()
            r4 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L23:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L8b
            java.lang.Object r14 = r10.next()
            r16 = r14
            android.hardware.Camera$Size r16 = (android.hardware.Camera.Size) r16
            r15 = r16
            int r0 = r15.width
            r27 = r0
            double r0 = (double) r0
            r17 = r0
            int r0 = r15.height
            r27 = r0
            double r0 = (double) r0
            r19 = r0
            r0 = r17
            java.lang.Double.isNaN(r0)
            r0 = r19
            java.lang.Double.isNaN(r0)
            r0 = r17
            r2 = r19
            double r0 = r0 / r2
            r17 = r0
            double r0 = r0 - r6
            r17 = r0
            double r17 = java.lang.Math.abs(r0)
            r22 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r21 = (r17 > r22 ? 1 : (r17 == r22 ? 0 : -1))
            if (r21 <= 0) goto L63
            goto L23
        L63:
            int r0 = r15.height
            r27 = r0
            r1 = r28
            int r0 = r0 - r1
            r27 = r0
            int r27 = java.lang.Math.abs(r0)
            r0 = r27
            double r0 = (double) r0
            r17 = r0
            int r21 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r21 >= 0) goto L23
            int r0 = r15.height
            r27 = r0
            r1 = r28
            int r0 = r0 - r1
            r27 = r0
            int r27 = java.lang.Math.abs(r0)
            r0 = r27
            double r11 = (double) r0
            r8 = r15
            goto L23
        L8b:
            if (r8 != 0) goto Lc9
            r0 = r26
            java.util.Iterator r10 = r0.iterator()
        L93:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Lc9
            java.lang.Object r14 = r10.next()
            r24 = r14
            android.hardware.Camera$Size r24 = (android.hardware.Camera.Size) r24
            r15 = r24
            int r0 = r15.height
            r27 = r0
            r1 = r28
            int r0 = r0 - r1
            r27 = r0
            int r27 = java.lang.Math.abs(r0)
            r0 = r27
            double r6 = (double) r0
            int r21 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r21 >= 0) goto L93
            int r0 = r15.height
            r27 = r0
            r1 = r28
            int r0 = r0 - r1
            r27 = r0
            int r27 = java.lang.Math.abs(r0)
            r0 = r27
            double r4 = (double) r0
            r8 = r15
            goto L93
        Lc9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.picture_picker.custom.ApiLevel19AndBelowCameraManager.getOptimalPreviewSize(java.util.List, int, int):android.hardware.Camera$Size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: pictureCallback$lambda-0  reason: not valid java name */
    public static final void m40008pictureCallback$lambda0(ApiLevel19AndBelowCameraManager apiLevel19AndBelowCameraManager, byte[] bArr, Camera camera) {
        Log_OC.getArray(apiLevel19AndBelowCameraManager, "this$0");
        int $i0 = bArr.length;
        Bitmap $r1 = BitmapFactory.decodeByteArray(bArr, 0, $i0);
        InterfaceC11767l $r4 = apiLevel19AndBelowCameraManager.onPictureListener;
        Log_OC.loadImage($r1, "bitmap");
        $r4.invoke($r1);
        apiLevel19AndBelowCameraManager.refreshCamera();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void refreshCamera() {
        Object[] $r2 = new Object[0];
        Timber.m1627e("Refreshing", $r2);
        if (this.camera != null) {
            SurfaceHolder $r4 = getHolder();
            Surface $r5 = $r4.getSurface();
            if ($r5 == null) {
                return;
            }
            Camera $r3 = this.camera;
            try {
                Log_OC.append($r3);
                $r3.stopPreview();
            } catch (Exception e) {
            }
            Camera $r32 = this.camera;
            try {
                Log_OC.append($r32);
                Camera.Parameters $r6 = $r32.getParameters();
                Camera.Size $r7 = this.previewSize;
                Log_OC.append($r7);
                int $i0 = $r7.width;
                Camera.Size $r72 = this.previewSize;
                Log_OC.append($r72);
                int $i1 = $r72.height;
                $r6.setPreviewSize($i0, $i1);
                Camera $r33 = this.camera;
                Log_OC.append($r33);
                $r33.setParameters($r6);
                Camera $r34 = this.camera;
                Log_OC.append($r34);
                SurfaceHolder $r42 = getHolder();
                $r34.setPreviewDisplay($r42);
                Camera $r35 = this.camera;
                Log_OC.append($r35);
                $r35.startPreview();
            } catch (Exception $r8) {
                $r8.printStackTrace();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void releaseCamera() {
        Object[] $r1 = new Object[0];
        Timber.m1627e("Released", $r1);
        Camera $r2 = this.camera;
        if ($r2 != null) {
            if ($r2 != null) {
                $r2.stopPreview();
            }
            Camera $r22 = this.camera;
            if ($r22 != null) {
                $r22.setPreviewCallback(null);
            }
            Camera $r23 = this.camera;
            if ($r23 != null) {
                $r23.release();
            }
            this.camera = null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int $i2 = getSuggestedMinimumWidth();
        int $i0 = View.resolveSize($i2, i);
        int $i22 = getSuggestedMinimumWidth();
        int $i1 = View.resolveSize($i22, i2);
        setMeasuredDimension($i0, $i1);
        Camera $r1 = this.camera;
        Log_OC.append($r1);
        Camera.Parameters $r2 = $r1.getParameters();
        List $r3 = $r2.getSupportedPreviewSizes();
        if ($r3 != null) {
            Camera.Size $r4 = getOptimalPreviewSize($r3, $i0, $i1);
            this.previewSize = $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void pauseCamera() {
        Object[] $r1 = new Object[0];
        Timber.m1627e("Paused", $r1);
        releaseCamera();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resumeCamera() {
        if (this.camera == null) {
            Camera $r1 = Camera.open();
            this.camera = $r1;
            Log_OC.append($r1);
            $r1.setDisplayOrientation(90);
            refreshCamera();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log_OC.getArray(surfaceHolder, "holder");
        refreshCamera();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log_OC.getArray(surfaceHolder, "holder");
        if (this.camera != null) {
            Surface $r3 = surfaceHolder.getSurface();
            if ($r3 == null) {
                return;
            }
            Camera $r2 = this.camera;
            try {
                Log_OC.append($r2);
                $r2.stopPreview();
            } catch (Exception $r4) {
                String $r5 = $r4.getMessage();
                Object[] $r6 = new Object[0];
                Timber.m1627e(Log_OC.m10359a("Exception 1 caught ", (Object) $r5), $r6);
                $r4.printStackTrace();
                CrashlyticsReport.logException($r4);
            }
            Camera $r22 = this.camera;
            try {
                Log_OC.append($r22);
                $r22.setPreviewDisplay(surfaceHolder);
                Camera $r23 = this.camera;
                Log_OC.append($r23);
                $r23.startPreview();
                this.safeToTakePicture = true;
            } catch (Exception $r7) {
                String $r52 = $r7.getMessage();
                Object[] $r62 = new Object[0];
                Timber.m1627e(Log_OC.m10359a("Exception 2 caught ", (Object) $r52), $r62);
                $r7.printStackTrace();
                CrashlyticsReport.logException($r7);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log_OC.getArray(surfaceHolder, "holder");
        releaseCamera();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void switchCamera() {
        int $i0 = Camera.getNumberOfCameras();
        if ($i0 > 1) {
            Object[] $r1 = new Object[0];
            Timber.m1627e("Switched", $r1);
            releaseCamera();
            chooseCamera();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void takePhoto(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "listener");
        this.onPictureListener = interfaceC11767l;
        boolean $z0 = this.safeToTakePicture;
        if ($z0) {
            Camera $r2 = this.camera;
            try {
                Log_OC.append($r2);
                Camera.PictureCallback $r3 = this.pictureCallback;
                $r2.takePicture(null, null, $r3);
                this.safeToTakePicture = false;
            } catch (Exception $r4) {
                $r4.printStackTrace();
            }
        }
    }
}
