package ai.kudi.agent.picture_picker.custom;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.WindowManager;
import androidx.core.content.C1335a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ApiLevel21AndAboveCameraManager.kt */
@Metadata(m10422d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b!*\u0003\f\u001a/\b\u0007\u0018\u0000 M2\u00020\u0001:\u0002MNB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\u0006\u00103\u001a\u00020)J\b\u00104\u001a\u00020)H\u0002J\b\u00105\u001a\u00020)H\u0002J\u0018\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H\u0002J\b\u00109\u001a\u00020)H\u0002J\u0010\u0010:\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0006\u0010=\u001a\u00020#J\u0006\u0010>\u001a\u00020#J\b\u0010?\u001a\u00020)H\u0002J\u0006\u0010@\u001a\u00020)J\b\u0010A\u001a\u00020)H\u0002J\u0018\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0013H\u0002J\b\u0010E\u001a\u00020)H\u0002J\u000e\u0010F\u001a\u00020)2\u0006\u0010 \u001a\u00020!J\u0018\u0010G\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020#H\u0002J\u0018\u0010I\u001a\u00020)2\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0013H\u0002J\u0006\u0010J\u001a\u00020)J\u001a\u0010K\u001a\u00020)2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'J\b\u0010L\u001a\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, m10421d2 = {"Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager;", "", "activity", "Landroid/app/Activity;", "textureView", "Lai/kudi/agent/picture_picker/custom/AutoFitTextureView;", "(Landroid/app/Activity;Lai/kudi/agent/picture_picker/custom/AutoFitTextureView;)V", "backgroundHandler", "Landroid/os/Handler;", "backgroundThread", "Landroid/os/HandlerThread;", "cameraCaptureCallBack", "ai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1", "Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1;", "cameraCaptureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "cameraFacing", "", "cameraId", "", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "cameraState", "cameraStateCallback", "ai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$cameraStateCallback$1", "Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$cameraStateCallback$1;", "captureRequest", "Landroid/hardware/camera2/CaptureRequest;", "captureRequestBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "flash", "Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$FLASH;", "isFlashSupported", "", "mAutoFocusSupported", "mSensorOrientation", "onBitmapReady", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "previewSize", "Landroid/util/Size;", "surface", "Landroid/view/Surface;", "surfaceTextureListener", "ai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$surfaceTextureListener$1", "Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$surfaceTextureListener$1;", "captureBitmap", "captureStillPicture", "close", "closeBackgroundThread", "closeCamera", "configureTransform", "viewWidth", "viewHeight", "createPreviewSession", "flashOn", "getOrientation", "rotation", "isFlashAuto", "isFlashON", "lockPreview", "onResume", "openBackgroundThread", "openCamera", "width", "height", "runPreCaptureSequence", "setFlash", "setFlashMode", "trigger", "setUpCameraOutputs", "switchCamera", "takePhoto", "unlockPreview", "Companion", "FLASH", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApiLevel21AndAboveCameraManager {
    private static final Companion Companion;
    @Deprecated
    private static final int MAX_PREVIEW_HEIGHT = 1080;
    @Deprecated
    private static final int MAX_PREVIEW_WIDTH = 1920;
    @Deprecated
    private static final SparseIntArray ORIENTATIONS;
    @Deprecated
    private static final int STATE_PICTURE_TAKEN = 4;
    @Deprecated
    private static final int STATE_PREVIEW = 0;
    @Deprecated
    private static final int STATE_WAITING_LOCK = 1;
    @Deprecated
    private static final int STATE_WAITING_NON_PRECAPTURE = 3;
    @Deprecated
    private static final int STATE_WAITING_PRECAPTURE = 2;
    @Deprecated
    private static final Comparator<Size> compareSizesByArea;
    private final Activity activity;
    private Handler backgroundHandler;
    private HandlerThread backgroundThread;
    private final ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1 cameraCaptureCallBack;
    private CameraCaptureSession cameraCaptureSession;
    private CameraDevice cameraDevice;
    private int cameraFacing;
    private String cameraId;
    private final CameraManager cameraManager;
    private int cameraState;
    private final ApiLevel21AndAboveCameraManager$cameraStateCallback$1 cameraStateCallback;
    private CaptureRequest captureRequest;
    private CaptureRequest.Builder captureRequestBuilder;
    private FLASH flash;
    private boolean isFlashSupported;
    private boolean mAutoFocusSupported;
    private int mSensorOrientation;
    private InterfaceC11767l<? super Bitmap, C13666w> onBitmapReady;
    private Size previewSize;
    private Surface surface;
    private final ApiLevel21AndAboveCameraManager$surfaceTextureListener$1 surfaceTextureListener;
    private final AutoFitTextureView textureView;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ApiLevel21AndAboveCameraManager.kt */
    @Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$Companion;", "", "()V", "MAX_PREVIEW_HEIGHT", "", "MAX_PREVIEW_WIDTH", "ORIENTATIONS", "Landroid/util/SparseIntArray;", "STATE_PICTURE_TAKEN", "STATE_PREVIEW", "STATE_WAITING_LOCK", "STATE_WAITING_NON_PRECAPTURE", "STATE_WAITING_PRECAPTURE", "compareSizesByArea", "Ljava/util/Comparator;", "Landroid/util/Size;", "chooseOptimalSize", "choices", "", "textureViewWidth", "textureViewHeight", "maxWidth", "maxHeight", "aspectRatio", "([Landroid/util/Size;IIIILandroid/util/Size;)Landroid/util/Size;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Size chooseOptimalSize(Size[] sizeArr, int i, int i2, int i3, int i4, Size size) {
            ArrayList $r1 = new ArrayList();
            ArrayList $r2 = new ArrayList();
            int $i5 = size.getWidth();
            int $i6 = size.getHeight();
            int $i2 = sizeArr.length;
            int $i7 = 0;
            while ($i7 < $i2) {
                Size $r3 = sizeArr[$i7];
                $i7++;
                int $i8 = $r3.getWidth();
                if ($i8 <= i3) {
                    int $i82 = $r3.getHeight();
                    if ($i82 <= i4) {
                        int $i83 = $r3.getHeight();
                        int $i9 = $r3.getWidth();
                        if ($i83 == ($i9 * $i6) / $i5) {
                            int $i84 = $r3.getWidth();
                            if ($i84 >= i) {
                                int $i85 = $r3.getHeight();
                                if ($i85 >= i2) {
                                    $r1.add($r3);
                                }
                            }
                            $r2.add($r3);
                        }
                    }
                }
            }
            boolean $z0 = $r1.isEmpty();
            if (!$z0) {
                Comparator $r5 = ApiLevel21AndAboveCameraManager.compareSizesByArea;
                Object $r6 = Collections.min($r1, $r5);
                Log_OC.loadImage($r6, "min(bigEnough, compareSizesByArea)");
                Size $r32 = (Size) $r6;
                return $r32;
            }
            boolean $z02 = $r2.isEmpty();
            if (!(!$z02)) {
                Log.e("Camera", "Couldn't find any suitable preview size");
                Size $r33 = sizeArr[0];
                return $r33;
            }
            Comparator $r52 = ApiLevel21AndAboveCameraManager.compareSizesByArea;
            Object $r62 = Collections.max($r2, $r52);
            Log_OC.loadImage($r62, "max(notBigEnough, compareSizesByArea)");
            Size $r34 = (Size) $r62;
            return $r34;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiLevel21AndAboveCameraManager.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager$FLASH;", "", "(Ljava/lang/String;I)V", "ON", "OFF", "AUTO", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class FLASH {
        private static final /* synthetic */ FLASH[] $VALUES;
        public static final FLASH AUTO;
        public static final FLASH MANUAL;
        public static final FLASH TAP;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private static final /* synthetic */ FLASH[] $values() {
            FLASH $r1 = MANUAL;
            FLASH $r12 = TAP;
            FLASH $r13 = AUTO;
            FLASH[] $r0 = {$r1, $r12, $r13};
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            FLASH $r1 = new FLASH("ON", 0);
            MANUAL = $r1;
            FLASH $r12 = new FLASH("OFF", 1);
            TAP = $r12;
            FLASH $r13 = new FLASH("AUTO", 2);
            AUTO = $r13;
            FLASH[] $r0 = $values();
            $VALUES = $r0;
        }

        private FLASH(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static FLASH valueOf(String str) {
            Enum $r0 = Enum.valueOf(FLASH.class, str);
            FLASH $r2 = (FLASH) $r0;
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static FLASH[] values() {
            FLASH[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            FLASH[] $r12 = (FLASH[]) $r0;
            return $r12;
        }
    }

    /* compiled from: ApiLevel21AndAboveCameraManager.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            FLASH[] $r0 = FLASH.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            FLASH $r2 = FLASH.MANUAL;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            FLASH $r22 = FLASH.AUTO;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        SparseIntArray $r1 = new SparseIntArray();
        ORIENTATIONS = $r1;
        $r1.append(0, 90);
        ORIENTATIONS.append(1, 0);
        ORIENTATIONS.append(2, 270);
        ORIENTATIONS.append(3, 180);
        Position $r2 = Position.AUTO;
        compareSizesByArea = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$cameraStateCallback$1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$surfaceTextureListener$1] */
    public ApiLevel21AndAboveCameraManager(Activity activity, AutoFitTextureView autoFitTextureView) {
        Log_OC.getArray(activity, "activity");
        Log_OC.getArray(autoFitTextureView, "textureView");
        this.activity = activity;
        this.textureView = autoFitTextureView;
        ApiLevel21AndAboveCameraManager$onBitmapReady$1 $r3 = ApiLevel21AndAboveCameraManager$onBitmapReady$1.INSTANCE;
        this.onBitmapReady = $r3;
        Context $r4 = autoFitTextureView.getContext();
        Object $r5 = $r4.getSystemService("camera");
        if ($r5 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            throw $r11;
        }
        CameraManager $r6 = (CameraManager) $r5;
        this.cameraManager = $r6;
        this.cameraFacing = 1;
        this.cameraId = "-1";
        FLASH $r7 = FLASH.AUTO;
        this.flash = $r7;
        this.isFlashSupported = true;
        this.cameraCaptureCallBack = new CameraCaptureSession.CaptureCallback() { // from class: ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private final void process(CaptureResult captureResult) {
                ApiLevel21AndAboveCameraManager $r2 = ApiLevel21AndAboveCameraManager.this;
                int $i0 = $r2.cameraState;
                if ($i0 == 1) {
                    CaptureResult.Key $r32 = CaptureResult.CONTROL_AF_STATE;
                    Object $r42 = captureResult.get($r32);
                    Integer $r52 = (Integer) $r42;
                    if ($r52 == null) {
                        ApiLevel21AndAboveCameraManager $r22 = ApiLevel21AndAboveCameraManager.this;
                        $r22.captureStillPicture();
                    } else if ($r52.intValue() == 4 || $r52.intValue() == 5) {
                        CaptureResult.Key $r33 = CaptureResult.CONTROL_AE_STATE;
                        Object $r43 = captureResult.get($r33);
                        Integer $r53 = (Integer) $r43;
                        if ($r53 != null && $r53.intValue() != 2) {
                            ApiLevel21AndAboveCameraManager $r23 = ApiLevel21AndAboveCameraManager.this;
                            $r23.runPreCaptureSequence();
                            return;
                        }
                        ApiLevel21AndAboveCameraManager $r24 = ApiLevel21AndAboveCameraManager.this;
                        $r24.cameraState = 4;
                        ApiLevel21AndAboveCameraManager $r25 = ApiLevel21AndAboveCameraManager.this;
                        $r25.captureStillPicture();
                    }
                } else if ($i0 == 2) {
                    CaptureResult.Key $r34 = CaptureResult.CONTROL_AE_STATE;
                    Object $r44 = captureResult.get($r34);
                    Integer $r54 = (Integer) $r44;
                    if ($r54 == null || $r54.intValue() == 5 || $r54.intValue() == 4) {
                        ApiLevel21AndAboveCameraManager $r26 = ApiLevel21AndAboveCameraManager.this;
                        $r26.cameraState = 3;
                    }
                } else if ($i0 != 3) {
                } else {
                    CaptureResult.Key $r35 = CaptureResult.CONTROL_AE_STATE;
                    Object $r45 = captureResult.get($r35);
                    Integer $r55 = (Integer) $r45;
                    if ($r55 == null || $r55.intValue() != 5) {
                        ApiLevel21AndAboveCameraManager $r27 = ApiLevel21AndAboveCameraManager.this;
                        $r27.cameraState = 4;
                        ApiLevel21AndAboveCameraManager $r28 = ApiLevel21AndAboveCameraManager.this;
                        $r28.captureStillPicture();
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Log_OC.getArray(cameraCaptureSession, "session");
                Log_OC.getArray(captureRequest, TransactionRequest.TYPE_REQUEST);
                Log_OC.getArray(totalCaptureResult, "result");
                process(totalCaptureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                Log_OC.getArray(cameraCaptureSession, "session");
                Log_OC.getArray(captureRequest, TransactionRequest.TYPE_REQUEST);
                Log_OC.getArray(captureResult, "partialResult");
                process(captureResult);
            }
        };
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$surfaceTextureListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Log_OC.getArray(surfaceTexture, "surface");
                ApiLevel21AndAboveCameraManager $r2 = ApiLevel21AndAboveCameraManager.this;
                $r2.openCamera(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Log_OC.getArray(surfaceTexture, "surface");
                return true;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Log_OC.getArray(surfaceTexture, "surface");
                ApiLevel21AndAboveCameraManager $r2 = ApiLevel21AndAboveCameraManager.this;
                $r2.configureTransform(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                Log_OC.getArray(surfaceTexture, "surface");
            }
        };
        this.cameraStateCallback = new CameraDevice.StateCallback() { // from class: ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$cameraStateCallback$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(CameraDevice cameraDevice) {
                Log_OC.getArray(cameraDevice, "camera");
                super.onClosed(cameraDevice);
                ApiLevel21AndAboveCameraManager $r2 = ApiLevel21AndAboveCameraManager.this;
                $r2.closeBackgroundThread();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                Log_OC.getArray(cameraDevice, "camera");
                cameraDevice.close();
                ApiLevel21AndAboveCameraManager $r2 = ApiLevel21AndAboveCameraManager.this;
                $r2.cameraDevice = null;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i) {
                Log_OC.getArray(cameraDevice, "camera");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                Log_OC.getArray(cameraDevice, "camera");
                ApiLevel21AndAboveCameraManager $r2 = ApiLevel21AndAboveCameraManager.this;
                $r2.cameraDevice = cameraDevice;
                ApiLevel21AndAboveCameraManager $r22 = ApiLevel21AndAboveCameraManager.this;
                $r22.createPreviewSession();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void captureBitmap() {
        AutoFitTextureView $r1 = this.textureView;
        boolean $z0 = $r1.isAvailable();
        if ($z0) {
            InterfaceC11767l $r2 = this.onBitmapReady;
            AutoFitTextureView $r12 = this.textureView;
            Bitmap $r3 = $r12.getBitmap();
            Log_OC.append($r3);
            Log_OC.loadImage($r3, "textureView.bitmap!!");
            $r2.invoke($r3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void captureStillPicture() {
        CameraDevice $r1 = this.cameraDevice;
        try {
            Log_OC.append($r1);
            CaptureRequest.Builder $r2 = $r1.createCaptureRequest(2);
            Log_OC.loadImage($r2, "cameraDevice!!.createCaptureRequest(CameraDevice.TEMPLATE_STILL_CAPTURE)");
            Surface $r3 = this.surface;
            Log_OC.append($r3);
            $r2.addTarget($r3);
            CaptureRequest.Key $r4 = CaptureRequest.CONTROL_AF_MODE;
            $r2.set($r4, 4);
            setFlashMode($r2, true);
            Activity $r6 = this.activity;
            WindowManager $r7 = $r6.getWindowManager();
            Display $r8 = $r7.getDefaultDisplay();
            int $i0 = $r8.getRotation();
            CaptureRequest.Key $r42 = CaptureRequest.JPEG_ORIENTATION;
            Integer $r5 = Integer.valueOf(getOrientation($i0));
            $r2.set($r42, $r5);
            CameraCaptureSession $r9 = this.cameraCaptureSession;
            Log_OC.append($r9);
            $r9.stopRepeating();
            CameraCaptureSession $r92 = this.cameraCaptureSession;
            Log_OC.append($r92);
            $r92.abortCaptures();
            CameraCaptureSession $r93 = this.cameraCaptureSession;
            Log_OC.append($r93);
            CaptureRequest $r10 = $r2.build();
            $r93.capture($r10, new CameraCaptureSession.CaptureCallback() { // from class: ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$captureStillPicture$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    Log_OC.getArray(cameraCaptureSession, "session");
                    Log_OC.getArray(captureRequest, TransactionRequest.TYPE_REQUEST);
                    Log_OC.getArray(totalCaptureResult, "result");
                    ApiLevel21AndAboveCameraManager $r43 = ApiLevel21AndAboveCameraManager.this;
                    $r43.captureBitmap();
                    ApiLevel21AndAboveCameraManager $r44 = ApiLevel21AndAboveCameraManager.this;
                    $r44.unlockPreview();
                }
            }, null);
        } catch (CameraAccessException $r12) {
            $r12.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void closeBackgroundThread() {
        Handler $r1 = this.backgroundHandler;
        if ($r1 != null) {
            HandlerThread $r2 = this.backgroundThread;
            Log_OC.append($r2);
            $r2.quitSafely();
            this.backgroundThread = null;
            this.backgroundHandler = null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void closeCamera() {
        CameraCaptureSession $r1 = this.cameraCaptureSession;
        if ($r1 != null) {
            Log_OC.append($r1);
            $r1.close();
            this.cameraCaptureSession = null;
        }
        CameraDevice $r2 = this.cameraDevice;
        if ($r2 != null) {
            Log_OC.append($r2);
            $r2.close();
            this.cameraDevice = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: compareSizesByArea$lambda-0  reason: not valid java name */
    public static final int m40009compareSizesByArea$lambda0(Size size, Size size2) {
        int $i0 = size.getWidth();
        long $l1 = $i0;
        int $i02 = size.getHeight();
        long $l2 = $i02;
        long $l12 = $l1 * $l2;
        int $i03 = size2.getWidth();
        long $l22 = $i03;
        int $i04 = size2.getHeight();
        long $l3 = $i04;
        int $i05 = Long.signum($l12 - ($l22 * $l3));
        return $i05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void configureTransform(int i, int i2) {
        Activity $r3 = this.activity;
        WindowManager $r4 = $r3.getWindowManager();
        Display $r5 = $r4.getDefaultDisplay();
        int $i2 = $r5.getRotation();
        Matrix $r1 = new Matrix();
        float $f0 = i;
        float $f1 = i2;
        RectF $r6 = new RectF(0.0f, 0.0f, $f0, $f1);
        Size $r7 = this.previewSize;
        Log_OC.append($r7);
        int $i0 = $r7.getHeight();
        float $f2 = $i0;
        Size $r72 = this.previewSize;
        Log_OC.append($r72);
        int $i02 = $r72.getWidth();
        RectF $r2 = new RectF(0.0f, 0.0f, $f2, $i02);
        float $f22 = $r6.centerX();
        float $f3 = $r6.centerY();
        if (1 == $i2 || 3 == $i2) {
            float $f4 = $r2.centerX();
            float $f5 = $r2.centerY();
            $r2.offset($f22 - $f4, $f3 - $f5);
            Matrix.ScaleToFit $r8 = Matrix.ScaleToFit.FILL;
            $r1.setRectToRect($r6, $r2, $r8);
            Size $r73 = this.previewSize;
            Log_OC.append($r73);
            int $i03 = $r73.getHeight();
            float $f42 = $i03;
            float $f12 = $f1 / $f42;
            Size $r74 = this.previewSize;
            Log_OC.append($r74);
            int $i04 = $r74.getWidth();
            float $f43 = $i04;
            float $f02 = Math.max($f12, $f0 / $f43);
            $r1.postScale($f02, $f02, $f22, $f3);
            int $i05 = $i2 - 2;
            $r1.postRotate($i05 * 90, $f22, $f3);
        } else if (2 == $i2) {
            $r1.postRotate(180.0f, $f22, $f3);
        }
        AutoFitTextureView $r9 = this.textureView;
        $r9.setTransform($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createPreviewSession() {
        AutoFitTextureView $r2 = this.textureView;
        try {
            SurfaceTexture $r3 = $r2.getSurfaceTexture();
            if ($r3 != null) {
                Size $r4 = this.previewSize;
                Log_OC.append($r4);
                int $i0 = $r4.getWidth();
                Size $r42 = this.previewSize;
                Log_OC.append($r42);
                int $i1 = $r42.getHeight();
                $r3.setDefaultBufferSize($i0, $i1);
            }
            if (this.surface == null) {
                this.surface = new Surface($r3);
            }
            Surface $r5 = this.surface;
            CameraDevice $r6 = this.cameraDevice;
            Log_OC.append($r6);
            CaptureRequest.Builder $r7 = $r6.createCaptureRequest(1);
            this.captureRequestBuilder = $r7;
            Log_OC.append($r7);
            Log_OC.append($r5);
            $r7.addTarget($r5);
            CameraDevice $r62 = this.cameraDevice;
            Log_OC.append($r62);
            List $r8 = Collections.singletonList($r5);
            CameraCaptureSession.StateCallback stateCallback = new CameraCaptureSession.StateCallback() { // from class: ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager$createPreviewSession$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onClosed(CameraCaptureSession cameraCaptureSession) {
                    Log_OC.getArray(cameraCaptureSession, "session");
                    super.onClosed(cameraCaptureSession);
                    ApiLevel21AndAboveCameraManager $r22 = ApiLevel21AndAboveCameraManager.this;
                    $r22.closeBackgroundThread();
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    Log_OC.getArray(cameraCaptureSession, "cameraCaptureSession");
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    Log_OC.getArray(cameraCaptureSession, "cameraCaptureSession");
                    ApiLevel21AndAboveCameraManager $r22 = ApiLevel21AndAboveCameraManager.this;
                    CameraDevice $r32 = $r22.cameraDevice;
                    if ($r32 == null) {
                        return;
                    }
                    ApiLevel21AndAboveCameraManager $r23 = ApiLevel21AndAboveCameraManager.this;
                    try {
                        $r23.cameraCaptureSession = cameraCaptureSession;
                        ApiLevel21AndAboveCameraManager $r24 = ApiLevel21AndAboveCameraManager.this;
                        CaptureRequest.Builder $r43 = $r24.captureRequestBuilder;
                        Log_OC.append($r43);
                        CaptureRequest.Key $r52 = CaptureRequest.CONTROL_AF_MODE;
                        $r43.set($r52, 4);
                        ApiLevel21AndAboveCameraManager $r25 = ApiLevel21AndAboveCameraManager.this;
                        ApiLevel21AndAboveCameraManager $r72 = ApiLevel21AndAboveCameraManager.this;
                        CaptureRequest.Builder $r44 = $r72.captureRequestBuilder;
                        Log_OC.append($r44);
                        $r25.captureRequest = $r44.build();
                        ApiLevel21AndAboveCameraManager $r26 = ApiLevel21AndAboveCameraManager.this;
                        CameraCaptureSession $r1 = $r26.cameraCaptureSession;
                        Log_OC.append($r1);
                        ApiLevel21AndAboveCameraManager $r27 = ApiLevel21AndAboveCameraManager.this;
                        CaptureRequest $r82 = $r27.captureRequest;
                        Log_OC.append($r82);
                        ApiLevel21AndAboveCameraManager $r28 = ApiLevel21AndAboveCameraManager.this;
                        ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1 $r9 = $r28.cameraCaptureCallBack;
                        ApiLevel21AndAboveCameraManager $r29 = ApiLevel21AndAboveCameraManager.this;
                        Handler $r10 = $r29.backgroundHandler;
                        $r1.setRepeatingRequest($r82, $r9, $r10);
                        ApiLevel21AndAboveCameraManager $r210 = ApiLevel21AndAboveCameraManager.this;
                        ApiLevel21AndAboveCameraManager $r73 = ApiLevel21AndAboveCameraManager.this;
                        CaptureRequest.Builder $r45 = $r73.captureRequestBuilder;
                        Log_OC.append($r45);
                        $r210.setFlashMode($r45, true);
                    } catch (Exception $r11) {
                        $r11.printStackTrace();
                    }
                }
            };
            Handler $r1 = this.backgroundHandler;
            $r62.createCaptureSession($r8, stateCallback, $r1);
        } catch (CameraAccessException $r10) {
            $r10.printStackTrace();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void flashOn(CaptureRequest.Builder builder) {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 > 28) {
            CaptureRequest.Key $r2 = CaptureRequest.FLASH_MODE;
            builder.set($r2, 2);
            return;
        }
        CaptureRequest.Key $r22 = CaptureRequest.CONTROL_AE_MODE;
        builder.set($r22, 3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int getOrientation(int i) {
        SparseIntArray $r1 = ORIENTATIONS;
        int $i0 = $r1.get(i);
        int $i1 = this.mSensorOrientation;
        return (($i0 + $i1) + 270) % 360;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void lockPreview() {
        CaptureRequest.Builder $r1 = this.captureRequestBuilder;
        try {
            Log_OC.append($r1);
            CaptureRequest.Key $r2 = CaptureRequest.CONTROL_AF_TRIGGER;
            $r1.set($r2, 1);
            this.cameraState = 1;
            CameraCaptureSession $r4 = this.cameraCaptureSession;
            Log_OC.append($r4);
            CaptureRequest.Builder $r12 = this.captureRequestBuilder;
            Log_OC.append($r12);
            CaptureRequest $r5 = $r12.build();
            ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1 $r6 = this.cameraCaptureCallBack;
            Handler $r7 = this.backgroundHandler;
            $r4.capture($r5, $r6, $r7);
        } catch (Exception $r8) {
            $r8.printStackTrace();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openBackgroundThread() {
        HandlerThread $r2 = new HandlerThread("camera_background_thread");
        this.backgroundThread = $r2;
        Log_OC.append($r2);
        $r2.start();
        HandlerThread $r22 = this.backgroundThread;
        Log_OC.append($r22);
        Looper $r1 = $r22.getLooper();
        Handler $r3 = new Handler($r1);
        this.backgroundHandler = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void openCamera(int i, int i2) {
        AutoFitTextureView $r1 = this.textureView;
        Context $r2 = $r1.getContext();
        int $i2 = C1335a.m36327a($r2, "android.permission.CAMERA");
        if ($i2 != 0) {
            Log.e("CustomCameraManager", "Requires Camera Permission");
            return;
        }
        setUpCameraOutputs(i, i2);
        configureTransform(i, i2);
        CameraManager $r3 = this.cameraManager;
        String $r4 = this.cameraId;
        ApiLevel21AndAboveCameraManager$cameraStateCallback$1 $r5 = this.cameraStateCallback;
        Handler $r6 = this.backgroundHandler;
        $r3.openCamera($r4, $r5, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void runPreCaptureSequence() {
        this.cameraState = 2;
        CaptureRequest.Builder $r4 = this.captureRequestBuilder;
        try {
            Log_OC.append($r4);
            setFlashMode($r4, true);
            CameraCaptureSession $r5 = this.cameraCaptureSession;
            Log_OC.append($r5);
            CaptureRequest.Builder $r42 = this.captureRequestBuilder;
            Log_OC.append($r42);
            CaptureRequest $r3 = $r42.build();
            ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1 $r1 = this.cameraCaptureCallBack;
            Handler $r2 = this.backgroundHandler;
            $r5.capture($r3, $r1, $r2);
        } catch (CameraAccessException $r6) {
            $r6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setFlashMode(CaptureRequest.Builder builder, boolean z) {
        if (z) {
            CaptureRequest.Key $r2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder.set($r2, 1);
        }
        FLASH $r4 = this.flash;
        int[] $r5 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r5[$r4.ordinal()];
        if ($i0 == 1) {
            flashOn(builder);
        } else if ($i0 != 2) {
            CaptureRequest.Key $r22 = CaptureRequest.FLASH_MODE;
            builder.set($r22, 0);
        } else {
            CaptureRequest.Key $r23 = CaptureRequest.CONTROL_AE_MODE;
            builder.set($r23, 2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024c, code lost:
        if (r48 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
        if (r12 != 180) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
        if (r12 != 270) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setUpCameraOutputs(int r48, int r49) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager.setUpCameraOutputs(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void unlockPreview() {
        CaptureRequest.Builder $r2 = this.captureRequestBuilder;
        try {
            Log_OC.append($r2);
            CaptureRequest.Key $r3 = CaptureRequest.CONTROL_AF_TRIGGER;
            $r2.set($r3, 2);
            CaptureRequest.Builder $r22 = this.captureRequestBuilder;
            Log_OC.append($r22);
            setFlashMode($r22, false);
            CameraCaptureSession $r5 = this.cameraCaptureSession;
            Log_OC.append($r5);
            CaptureRequest.Builder $r23 = this.captureRequestBuilder;
            Log_OC.append($r23);
            CaptureRequest $r6 = $r23.build();
            ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1 $r7 = this.cameraCaptureCallBack;
            Handler $r1 = this.backgroundHandler;
            $r5.capture($r6, $r7, $r1);
            this.cameraState = 0;
            CameraCaptureSession $r52 = this.cameraCaptureSession;
            Log_OC.append($r52);
            CaptureRequest $r62 = this.captureRequest;
            Log_OC.append($r62);
            ApiLevel21AndAboveCameraManager$cameraCaptureCallBack$1 $r72 = this.cameraCaptureCallBack;
            Handler $r12 = this.backgroundHandler;
            $r52.setRepeatingRequest($r62, $r72, $r12);
        } catch (CameraAccessException $r8) {
            $r8.printStackTrace();
        }
    }

    public final void close() {
        closeCamera();
        closeBackgroundThread();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isFlashAuto() {
        boolean $z0 = this.isFlashSupported;
        if ($z0) {
            FLASH $r2 = this.flash;
            FLASH $r1 = FLASH.AUTO;
            if ($r2 == $r1) {
                int $i0 = this.cameraFacing;
                return $i0 == 1;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isFlashON() {
        boolean $z0 = this.isFlashSupported;
        if ($z0) {
            FLASH $r2 = this.flash;
            FLASH $r1 = FLASH.MANUAL;
            if ($r2 == $r1) {
                int $i0 = this.cameraFacing;
                return $i0 == 1;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onResume() {
        openBackgroundThread();
        AutoFitTextureView $r1 = this.textureView;
        boolean $z0 = $r1.isAvailable();
        if (!$z0) {
            AutoFitTextureView $r12 = this.textureView;
            ApiLevel21AndAboveCameraManager$surfaceTextureListener$1 $r2 = this.surfaceTextureListener;
            $r12.setSurfaceTextureListener($r2);
            return;
        }
        AutoFitTextureView $r13 = this.textureView;
        int $i0 = $r13.getWidth();
        AutoFitTextureView $r14 = this.textureView;
        int $i1 = $r14.getHeight();
        openCamera($i0, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setFlash(FLASH flash) {
        Log_OC.getArray(flash, "flash");
        this.flash = flash;
        AutoFitTextureView $r2 = this.textureView;
        Context $r3 = $r2.getContext();
        PackageManager $r4 = $r3.getPackageManager();
        boolean $z0 = $r4.hasSystemFeature("android.hardware.camera.flash");
        if ($z0) {
            int $i0 = this.cameraFacing;
            if ($i0 == 0) {
                Log.e("CustomCameraManager", "Front Camera Flash isn't supported yet.");
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void switchCamera() {
        close();
        int $i0 = this.cameraFacing;
        byte $b1 = $i0 == 1 ? (byte) 0 : (byte) 1;
        this.cameraFacing = $b1;
        onResume();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void takePhoto(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "onBitmapReady");
        this.onBitmapReady = interfaceC11767l;
        boolean $z0 = this.mAutoFocusSupported;
        if ($z0) {
            lockPreview();
        } else {
            captureStillPicture();
        }
    }
}
