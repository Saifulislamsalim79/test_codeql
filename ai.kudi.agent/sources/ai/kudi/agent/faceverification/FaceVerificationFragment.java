package ai.kudi.agent.faceverification;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.FileProcessor;
import ai.kudi.agent.core.util.FragmentExtensionKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentFaceVerificationBinding;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceDobFragment;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C1335a;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.PreferenceActivity;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11811v;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.p200b.C7438f;
import p198f.p199a.p200b.SurfaceHolder$CallbackC7437e;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: FaceVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003JKLB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0014J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0003J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J$\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\rH\u0002J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020\u0014H\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\rH\u0002J-\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u0002072\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r092\u0006\u0010:\u001a\u00020;H\u0016¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u0014H\u0016J\u0010\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010@J\u001a\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010C\u001a\u00020\u0014H\u0002J\b\u0010D\u001a\u00020\u0014H\u0002J\u0016\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000207J\b\u0010I\u001a\u00020\u0014H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006M"}, m10421d2 = {"Lai/kudi/agent/faceverification/FaceVerificationFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/faceverification/FaceVerificationViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/databinding/FragmentFaceVerificationBinding;", "()V", "delayedHandler", "Landroid/os/Handler;", "listener", "Lai/kudi/agent/faceverification/FaceVerificationFragment$OnFragmentInteractionListener;", "mPreview", "Lai/kudi/facedetection/CameraPreview;", "type", "", "viewModel", "getViewModel", "()Lai/kudi/agent/faceverification/FaceVerificationViewModel;", "setViewModel", "(Lai/kudi/agent/faceverification/FaceVerificationViewModel;)V", "applyViewData", "", "viewData", "beginBlinkDetection", "beginSecondBlinkDetection", "beginSmileDetection", "createViewModel", "getVMType", "Ljava/lang/Class;", "isCameraPermissionGiven", "", "isStoragePermissionGiven", "observeViewModel", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onFaceVerificationFailed", "imagePath", "onImageCaptured", "bitmap", "Landroid/graphics/Bitmap;", "onPause", "onPictureUploadSuccessful", "pictureId", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onVerificationSuccessful", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "onViewCreated", "view", "requestCameraPermission", "requestStoragePermission", "showVerifyWithBvn", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "frameId", "startCamera", "Companion", "OnFragmentInteractionListener", "TYPES", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FaceVerificationFragment extends BaseMVVMViewBindingFragment<FaceVerificationViewModel, ViewData, FragmentFaceVerificationBinding> {
    public static final Companion Companion;
    public static final String PAGE_KEY = "FaceVerificationFragment";
    public static final String TYPE = "TYPE";
    private Handler delayedHandler;
    private OnFragmentInteractionListener listener;
    private SurfaceHolder$CallbackC7437e mPreview;
    private String type = "";
    public FaceVerificationViewModel viewModel;

    /* compiled from: FaceVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/faceverification/FaceVerificationFragment$Companion;", "", "()V", "TAG", "", "TYPE", "newInstance", "Lai/kudi/agent/faceverification/FaceVerificationFragment;", "type", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ FaceVerificationFragment newInstance$default(Companion companion, String $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                TYPES $r3 = TYPES.SIGN_UP;
                $r2 = $r3.name();
            }
            FaceVerificationFragment $r4 = companion.newInstance($r2);
            return $r4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final FaceVerificationFragment newInstance(String str) {
            Log_OC.getArray(str, "type");
            FaceVerificationFragment $r2 = new FaceVerificationFragment();
            C13287o $r4 = C13664u.m4227a("TYPE", str);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r2.setArguments($r5);
            return $r2;
        }
    }

    /* compiled from: FaceVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/faceverification/FaceVerificationFragment$OnFragmentInteractionListener;", "", "onCancelButtonAction", "", "onContinueButtonAction", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "onPictureUploadSuccessful", "pictureId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface OnFragmentInteractionListener {
        void onCancelButtonAction();

        void onContinueButtonAction(RegistrationInfo registrationInfo);

        void onPictureUploadSuccessful(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FaceVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/faceverification/FaceVerificationFragment$TYPES;", "", "(Ljava/lang/String;I)V", "LOGIN", "SIGN_UP", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TYPES {
        private static final /* synthetic */ TYPES[] $VALUES;
        public static final TYPES LOGIN;
        public static final TYPES SIGN_UP;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private static final /* synthetic */ TYPES[] $values() {
            TYPES $r1 = LOGIN;
            TYPES $r12 = SIGN_UP;
            TYPES[] $r0 = {$r1, $r12};
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            TYPES $r1 = new TYPES("LOGIN", 0);
            LOGIN = $r1;
            TYPES $r12 = new TYPES("SIGN_UP", 1);
            SIGN_UP = $r12;
            TYPES[] $r0 = $values();
            $VALUES = $r0;
        }

        private TYPES(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static TYPES valueOf(String str) {
            Enum $r0 = Enum.valueOf(TYPES.class, str);
            TYPES $r2 = (TYPES) $r0;
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static TYPES[] values() {
            TYPES[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            TYPES[] $r12 = (TYPES[]) $r0;
            return $r12;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void beginBlinkDetection() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentFaceVerificationBinding $r2 = (FragmentFaceVerificationBinding) $r1;
        $r2.stepIcon.setImageResource(C0001R.C0002drawable.ic_face_verification_blink);
        $r2.stepGifIcon.m32587g();
        View $r4 = $r2.stepGifIcon;
        Log_OC.loadImage($r4, "stepGifIcon");
        View r8 = $r4;
        ViewExtKt.hide$default(r8, false, 1, null);
        ImageView $r3 = $r2.stepIcon;
        Log_OC.loadImage($r3, "stepIcon");
        ViewExtKt.show($r3);
        TextView $r5 = $r2.stepText;
        String $r6 = getString(C0001R.string.kindly_blink_with_both_eyes);
        $r5.setText($r6);
        ProgressBar $r7 = $r2.progressBar;
        $r7.setProgress(20);
        TextView $r52 = $r2.stepDescription;
        Log_OC.loadImage($r52, "stepDescription");
        ViewExtKt.hide$default($r52, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void beginSecondBlinkDetection() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentFaceVerificationBinding $r2 = (FragmentFaceVerificationBinding) $r1;
        ImageView $r3 = $r2.stepIcon;
        $r3.setImageResource(C0001R.C0002drawable.ic_face_verification_blink);
        TextView $r4 = $r2.stepText;
        String $r5 = getString(C0001R.string.kindly_blink_again_with_both_eyes);
        $r4.setText($r5);
        ProgressBar $r6 = $r2.progressBar;
        $r6.setProgress(40);
        TextView $r42 = $r2.stepDescription;
        Log_OC.loadImage($r42, "stepDescription");
        ViewExtKt.hide$default($r42, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void beginSmileDetection() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentFaceVerificationBinding $r2 = (FragmentFaceVerificationBinding) $r1;
        ImageView $r3 = $r2.stepIcon;
        $r3.setImageResource(C0001R.C0002drawable.ic_face_verification_smile);
        TextView $r4 = $r2.stepText;
        String $r5 = getString(C0001R.string.now_smile__no_jokes);
        $r4.setText($r5);
        ProgressBar $r6 = $r2.progressBar;
        $r6.setProgress(60);
        TextView $r42 = $r2.stepDescription;
        String $r52 = getString(C0001R.string.a_smile_is_a_good_sign_that_you_are_our_partner_and_friend);
        $r42.setText($r52);
        TextView $r43 = $r2.stepDescription;
        Log_OC.loadImage($r43, "stepDescription");
        ViewExtKt.show($r43);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isCameraPermissionGiven() {
        Context $r1 = requireContext();
        int $i0 = C1335a.m36327a($r1, "android.permission.CAMERA");
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isStoragePermissionGiven() {
        Context $r1 = requireContext();
        int $i0 = C1335a.m36327a($r1, "android.permission.READ_EXTERNAL_STORAGE");
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeViewModel() {
        FaceVerificationViewModel $r2 = getViewModel();
        C11680b $r3 = $r2.getOnPictureUploaded();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        Log_OC.loadImage($r4, "viewLifecycleOwner");
        AbstractC11688p $r5 = C7390a.a($r3, $r4);
        Object object = new Object() { // from class: ai.kudi.agent.faceverification.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FaceVerificationFragment $r1 = FaceVerificationFragment.this;
                String $r32 = (String) obj;
                $r1.onPictureUploadSuccessful($r32);
            }
        };
        Function $r1 = Function.f253N;
        $r5.e0(object, $r1);
        FaceVerificationViewModel $r22 = getViewModel();
        C11680b $r32 = $r22.getOnPictureUploadFail();
        PreferenceActivity $r42 = getViewLifecycleOwner();
        Log_OC.loadImage($r42, "viewLifecycleOwner");
        AbstractC11688p $r52 = C7390a.a($r32, $r42);
        Object object2 = new Object() { // from class: ai.kudi.agent.faceverification.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FaceVerificationFragment $r12 = FaceVerificationFragment.this;
                String $r33 = (String) obj;
                $r12.onFaceVerificationFailed($r33);
            }
        };
        Chunk $r8 = Chunk.NEXTPAGE;
        $r52.e0(object2, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-1  reason: not valid java name */
    public static final void m39231observeViewModel$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-2  reason: not valid java name */
    public static final void m39232observeViewModel$lambda2(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onFaceVerificationFailed(String str) {
        CustomDialog.Companion $r2 = CustomDialog.Companion;
        Context $r4 = requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        String $r5 = getString(C0001R.string.verification_upload_failed_message);
        Log_OC.loadImage($r5, "getString(R.string.verification_upload_failed_message)");
        String $r6 = getString(C0001R.string.retry);
        Log_OC.loadImage($r6, "getString(R.string.retry)");
        FaceVerificationFragment$onFaceVerificationFailed$1 $r3 = new FaceVerificationFragment$onFaceVerificationFailed$1(this, str);
        CustomDialog.Companion.show$default($r2, $r4, $r5, $r6, false, true, true, (InterfaceC11756a) $r3, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onImageCaptured(Bitmap bitmap) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentFaceVerificationBinding $r3 = (FragmentFaceVerificationBinding) $r2;
        FileProcessor.Companion $r4 = FileProcessor.Companion;
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        String $r6 = FileProcessor.Companion.getCompressedBitmapFilePathFrom$default($r4, $r5, bitmap, 0, null, 12, null);
        if ($r6 == null) {
            return;
        }
        $r3.capturedImageView.setImageBitmap(bitmap);
        ImageView $r7 = $r3.capturedImageView;
        Log_OC.loadImage($r7, "capturedImageView");
        ViewExtKt.show($r7);
        ImageView $r72 = $r3.toggleFacing;
        Log_OC.loadImage($r72, "toggleFacing");
        ViewExtKt.hide$default($r72, false, 1, null);
        SurfaceHolder$CallbackC7437e $r8 = this.mPreview;
        if ($r8 != null) {
            $r8.m18736f();
        }
        this.mPreview = null;
        FaceVerificationViewModel $r9 = getViewModel();
        $r9.uploadImage($r6);
        View $r10 = $r3.stepGifIcon;
        Log_OC.loadImage($r10, "stepGifIcon");
        View r13 = $r10;
        ViewExtKt.show(r13);
        $r3.stepGifIcon.m32588f();
        ImageView $r73 = $r3.stepIcon;
        Log_OC.loadImage($r73, "stepIcon");
        ViewExtKt.hide($r73, true);
        TextView $r11 = $r3.stepText;
        $r11.setText(getString(C0001R.string.verifying_your_image));
        ProgressBar $r12 = $r3.progressBar;
        $r12.setProgress(80);
        TextView $r112 = $r3.stepDescription;
        $r112.setText(getString(C0001R.string.we_are_checking_your_image_with_your_bvn_details_to_be_sure_you_are_the_owner));
        TextView $r113 = $r3.stepDescription;
        Log_OC.loadImage($r113, "stepDescription");
        ViewExtKt.show($r113);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onPictureUploadSuccessful(String str) {
        OnFragmentInteractionListener $r2 = this.listener;
        if ($r2 == null) {
            return;
        }
        $r2.onPictureUploadSuccessful(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onVerificationSuccessful$lambda-13$lambda-11  reason: not valid java name */
    public static final void m39233onVerificationSuccessful$lambda13$lambda11(FaceVerificationFragment faceVerificationFragment, RegistrationInfo registrationInfo, View view) {
        Log_OC.getArray(faceVerificationFragment, "this$0");
        OnFragmentInteractionListener $r3 = faceVerificationFragment.listener;
        if ($r3 == null) {
            return;
        }
        $r3.onContinueButtonAction(registrationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onVerificationSuccessful$lambda-13$lambda-12  reason: not valid java name */
    public static final void m39234onVerificationSuccessful$lambda13$lambda12(FaceVerificationFragment faceVerificationFragment, View view) {
        Log_OC.getArray(faceVerificationFragment, "this$0");
        OnFragmentInteractionListener $r2 = faceVerificationFragment.listener;
        if ($r2 == null) {
            return;
        }
        $r2.onCancelButtonAction();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestCameraPermission() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 23) {
            String[] $r1 = {"android.permission.CAMERA"};
            requestPermissions($r1, 10);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestStoragePermission() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 23) {
            String[] $r1 = {"android.permission.READ_EXTERNAL_STORAGE"};
            requestPermissions($r1, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showVerifyWithBvn$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39235showVerifyWithBvn$lambda4$lambda3(FaceVerificationFragment faceVerificationFragment, OtpVerificationModel otpVerificationModel, int i, View view) {
        Log_OC.getArray(faceVerificationFragment, "this$0");
        Log_OC.getArray(otpVerificationModel, "$otpVerificationModel");
        AppCompatActivity $r3 = FragmentExtensionKt.requireAppCompatActivity(faceVerificationFragment);
        UnknownDeviceDobFragment.Companion $r4 = UnknownDeviceDobFragment.Companion;
        UnknownDeviceDobFragment $r5 = $r4.newInstance(otpVerificationModel);
        AppCompatActivityExtKt.startFragment$default($r3, $r5, i, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r18v0, types: [f.a.b.f, T] */
    private final void startCamera() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentFaceVerificationBinding $r3 = (FragmentFaceVerificationBinding) $r2;
        ImageView $r4 = $r3.capturedImageView;
        Log_OC.loadImage($r4, "requireBinding().capturedImageView");
        boolean $z0 = false;
        ViewExtKt.hide$default($r4, false, 1, null);
        final C11811v r14 = new C11811v();
        final C11812w r15 = new C11812w();
        C7438f.InterfaceC7440b interfaceC7440b = new C7438f.InterfaceC7440b() { // from class: ai.kudi.agent.faceverification.FaceVerificationFragment$startCamera$previewCallBack$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p198f.p199a.p200b.C7438f.InterfaceC7440b
            public void onCaptured(Bitmap bitmap) {
                Log_OC.getArray(bitmap, "bitmap");
                C11812w $r22 = r15;
                Object $r32 = $r22.f26499c;
                C7438f $r42 = (C7438f) $r32;
                if ($r42 != null) {
                    $r42.m18719l(null);
                }
                FaceVerificationFragment $r5 = FaceVerificationFragment.this;
                $r5.onImageCaptured(bitmap);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p198f.p199a.p200b.C7438f.InterfaceC7440b
            public void onError(String str) {
                Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
                String $r1 = Log_OC.m10359a("Error: ", (Object) str);
                Object[] $r22 = new Object[0];
                Timber.m1627e($r1, $r22);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p198f.p199a.p200b.C7438f.InterfaceC7440b
            public void onEyeBlink() {
                FaceVerificationFragment $r22 = FaceVerificationFragment.this;
                InterfaceC8209a $r1 = $r22.requireBinding();
                FragmentFaceVerificationBinding $r32 = (FragmentFaceVerificationBinding) $r1;
                TextView $r42 = $r32.errorTextView;
                if ($r42 != null) {
                    ViewExtKt.hide$default($r42, false, 1, null);
                }
                int $i0 = r14.f26498c;
                if ($i0 >= 2) {
                    FaceVerificationFragment $r23 = FaceVerificationFragment.this;
                    $r23.beginSmileDetection();
                    C11812w $r6 = r15;
                    Object $r7 = $r6.f26499c;
                    C7438f $r8 = (C7438f) $r7;
                    if ($r8 == null) {
                        return;
                    }
                    C7438f.EnumC7439a $r9 = C7438f.EnumC7439a.DETECT_SMILE;
                    $r8.m18719l($r9);
                    return;
                }
                FaceVerificationFragment $r24 = FaceVerificationFragment.this;
                $r24.beginSecondBlinkDetection();
                C11811v $r5 = r14;
                int $i02 = $r5.f26498c;
                $r5.f26498c = $i02 + 1;
                C11812w $r62 = r15;
                Object $r72 = $r62.f26499c;
                C7438f $r82 = (C7438f) $r72;
                if ($r82 == null) {
                    return;
                }
                C7438f.EnumC7439a $r92 = C7438f.EnumC7439a.DETECT_BLINK_AGAIN;
                $r82.m18719l($r92);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p198f.p199a.p200b.C7438f.InterfaceC7440b
            public void onFacesNotMatching() {
                FaceVerificationFragment $r22 = FaceVerificationFragment.this;
                InterfaceC8209a $r1 = $r22.requireBinding();
                FragmentFaceVerificationBinding $r32 = (FragmentFaceVerificationBinding) $r1;
                TextView $r42 = $r32.errorTextView;
                if ($r42 != null) {
                    ViewExtKt.show($r42);
                }
                FaceVerificationFragment $r23 = FaceVerificationFragment.this;
                $r23.beginBlinkDetection();
                C11811v $r5 = r14;
                $r5.f26498c = 0;
                C11812w $r6 = r15;
                Object $r7 = $r6.f26499c;
                C7438f $r8 = (C7438f) $r7;
                if ($r8 == null) {
                    return;
                }
                C7438f.EnumC7439a $r9 = C7438f.EnumC7439a.DETECT_BLINK;
                $r8.m18719l($r9);
            }

            public void onMoreThan1FaceDetected() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p198f.p199a.p200b.C7438f.InterfaceC7440b
            public void onSmile() {
                C11812w $r22 = r15;
                Object $r32 = $r22.f26499c;
                C7438f $r42 = (C7438f) $r32;
                if ($r42 == null) {
                    return;
                }
                C7438f.EnumC7439a $r1 = C7438f.EnumC7439a.CAPTURE;
                $r42.m18719l($r1);
            }
        };
        try {
            Context $r8 = requireContext();
            Log_OC.loadImage($r8, "requireContext()");
            SurfaceHolder$CallbackC7437e r17 = new SurfaceHolder$CallbackC7437e($r8);
            this.mPreview = r17;
            r15.f26499c = new C7438f(interfaceC7440b);
            InterfaceC8209a $r22 = requireBinding();
            FragmentFaceVerificationBinding $r32 = (FragmentFaceVerificationBinding) $r22;
            FrameLayout $r10 = $r32.preview;
            $r10.removeAllViews();
            SurfaceHolder$CallbackC7437e $r7 = this.mPreview;
            if ($r7 != null) {
                Object $r11 = r15.f26499c;
                C7438f $r9 = (C7438f) $r11;
                $r7.setFaceDetectionProcessor($r9);
                InterfaceC8209a $r23 = requireBinding();
                FragmentFaceVerificationBinding $r33 = (FragmentFaceVerificationBinding) $r23;
                FrameLayout $r102 = $r33.preview;
                SurfaceHolder$CallbackC7437e r20 = $r7;
                $r102.addView(r20);
            }
            SurfaceHolder$CallbackC7437e $r72 = this.mPreview;
            if ($r72 != null) {
                boolean $z1 = $r72.m18738d();
                if ($z1) {
                    $z0 = true;
                }
            }
            if (!$z0) {
                InterfaceC8209a $r24 = requireBinding();
                FragmentFaceVerificationBinding $r34 = (FragmentFaceVerificationBinding) $r24;
                $r34.toggleFacing.setVisibility(8);
                return;
            }
            InterfaceC8209a $r25 = requireBinding();
            FragmentFaceVerificationBinding $r35 = (FragmentFaceVerificationBinding) $r25;
            $r35.toggleFacing.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.faceverification.g
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceVerificationFragment $r26 = FaceVerificationFragment.this;
                    FaceVerificationFragment.m39236startCamera$lambda6($r26, view);
                }
            });
        } catch (Exception $r13) {
            Timber.reorder($r13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: startCamera$lambda-6  reason: not valid java name */
    public static final void m39236startCamera$lambda6(FaceVerificationFragment faceVerificationFragment, View view) {
        Log_OC.getArray(faceVerificationFragment, "this$0");
        SurfaceHolder$CallbackC7437e $r2 = faceVerificationFragment.mPreview;
        if ($r2 == null) {
            return;
        }
        $r2.m18731k();
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected void applyViewData(ViewData viewData) {
        Log_OC.getArray(viewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        FaceVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public FaceVerificationViewModel createViewModel() {
        FaceVerificationViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return FaceVerificationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final FaceVerificationViewModel getViewModel() {
        FaceVerificationViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        OnFragmentInteractionListener $r6;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        Application $r3 = $r2 == null ? null : $r2.getApplication();
        if ($r3 == null) {
            NullPointerException $r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r9;
        }
        BaseApplication $r4 = (BaseApplication) $r3;
        ApplicationComponent $r5 = $r4.initializeComponent();
        $r5.inject(this);
        boolean $z0 = context instanceof OnFragmentInteractionListener;
        if (!$z0) {
            Fragment $r7 = getParentFragment();
            if ($r7 != null) {
                Fragment $r72 = getParentFragment();
                boolean $z02 = $r72 instanceof OnFragmentInteractionListener;
                if ($z02) {
                    Fragment $r73 = requireParentFragment();
                    $r6 = (OnFragmentInteractionListener) $r73;
                }
            }
            RuntimeException $r8 = new RuntimeException("Parent fragment or activity must implement OnFragmentInteractionListener");
            throw $r8;
        }
        $r6 = (OnFragmentInteractionListener) context;
        this.listener = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString("TYPE");
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        this.type = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentFaceVerificationBinding $r4 = FragmentFaceVerificationBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Handler $r1 = this.delayedHandler;
        if ($r1 != null) {
            $r1.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SurfaceHolder$CallbackC7437e $r1 = this.mPreview;
        if ($r1 != null) {
            $r1.m18736f();
        }
        this.mPreview = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10) {
            boolean $z0 = isCameraPermissionGiven();
            if ($z0) {
                boolean $z02 = isStoragePermissionGiven();
                if ($z02) {
                    return;
                }
                requestStoragePermission();
                return;
            }
        }
        if (i == 20) {
            boolean $z03 = isStoragePermissionGiven();
            if ($z03) {
                startCamera();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean $z0 = isCameraPermissionGiven();
        if ($z0) {
            boolean $z02 = isStoragePermissionGiven();
            if ($z02) {
                startCamera();
            } else {
                requestStoragePermission();
            }
        } else {
            requestCameraPermission();
        }
        beginBlinkDetection();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onVerificationSuccessful(final RegistrationInfo registrationInfo) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentFaceVerificationBinding $r3 = (FragmentFaceVerificationBinding) $r2;
        $r3.stepIcon.setImageResource(C0001R.C0002drawable.ic_face_verification_success);
        CamomileSpinner $r5 = $r3.stepGifIcon;
        $r5.m32587g();
        CamomileSpinner $r52 = $r3.stepGifIcon;
        $r52.m32587g();
        View $r53 = $r3.stepGifIcon;
        Log_OC.loadImage($r53, "stepGifIcon");
        View r14 = $r53;
        ViewExtKt.hide$default(r14, false, 1, null);
        ImageView $r4 = $r3.stepIcon;
        Log_OC.loadImage($r4, "stepIcon");
        ViewExtKt.show($r4);
        TextView $r6 = $r3.stepText;
        String $r7 = getString(C0001R.string.all_good);
        $r6.setText($r7);
        ProgressBar $r8 = $r3.progressBar;
        $r8.setProgress(100);
        TextView $r62 = $r3.stepDescription;
        Log_OC.loadImage($r62, "stepDescription");
        ViewExtKt.hide$default($r62, false, 1, null);
        View $r9 = $r3.continueButton;
        Log_OC.loadImage($r9, "continueButton");
        View r142 = $r9;
        ViewExtKt.show(r142);
        View $r92 = $r3.cancelButton;
        Log_OC.loadImage($r92, "cancelButton");
        View r143 = $r92;
        ViewExtKt.show(r143);
        ImageButton r15 = $r3.continueButton;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.faceverification.Block
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceVerificationFragment $r22 = FaceVerificationFragment.this;
                RegistrationInfo $r32 = registrationInfo;
                FaceVerificationFragment.m39233onVerificationSuccessful$lambda13$lambda11($r22, $r32, view);
            }
        });
        ImageButton r152 = $r3.cancelButton;
        r152.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.faceverification.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceVerificationFragment $r22 = FaceVerificationFragment.this;
                FaceVerificationFragment.m39234onVerificationSuccessful$lambda13$lambda12($r22, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        observeViewModel();
    }

    public final void setViewModel(FaceVerificationViewModel faceVerificationViewModel) {
        Log_OC.getArray(faceVerificationViewModel, "<set-?>");
        this.viewModel = faceVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showVerifyWithBvn(final OtpVerificationModel otpVerificationModel, final int i) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        String $r2 = this.type;
        TYPES $r3 = TYPES.LOGIN;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        if ($z0) {
            InterfaceC8209a $r5 = requireBinding();
            FragmentFaceVerificationBinding $r6 = (FragmentFaceVerificationBinding) $r5;
            TextView $r7 = $r6.faceDoesNotMatchView;
            Log_OC.loadImage($r7, "faceDoesNotMatchView");
            ViewExtKt.show($r7);
            View $r8 = $r6.verifyWithBvnView;
            Log_OC.loadImage($r8, "verifyWithBvnView");
            View r13 = $r8;
            ViewExtKt.show(r13);
            $r6.stepGifIcon.m32587g();
            View $r9 = $r6.stepGifIcon;
            Log_OC.loadImage($r9, "stepGifIcon");
            View r132 = $r9;
            ViewExtKt.hide$default(r132, false, 1, null);
            ImageView $r10 = $r6.stepIcon;
            Log_OC.loadImage($r10, "stepIcon");
            ViewExtKt.hide$default($r10, false, 1, null);
            TextView $r72 = $r6.stepDescription;
            Log_OC.loadImage($r72, "stepDescription");
            ViewExtKt.hide$default($r72, false, 1, null);
            TextView $r73 = $r6.stepText;
            Log_OC.loadImage($r73, "stepText");
            ViewExtKt.hide$default($r73, false, 1, null);
            ViewGroup r14 = $r6.verifyWithBvnView;
            r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.faceverification.b
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceVerificationFragment $r22 = FaceVerificationFragment.this;
                    OtpVerificationModel $r32 = otpVerificationModel;
                    int $i0 = i;
                    FaceVerificationFragment.m39235showVerifyWithBvn$lambda4$lambda3($r22, $r32, $i0, view);
                }
            });
        }
    }
}
