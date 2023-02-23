package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.FragmentKycCameraBinding;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.picture_picker.domains.models.PicturePickerOption;
import ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment;
import ai.kudi.agent.picture_picker.views.PicturePickerCallback;
import ai.kudi.dip.library.button.KudiButton;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CameraFragment.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 =2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001=B\u0005¢\u0006\u0002\u0010\u0005J\u0019\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0096\u0001J\u0012\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J$\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0019H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\u0018\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020\fH\u0016J \u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0019H\u0016J\b\u00106\u001a\u00020\fH\u0016J\u001a\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\t\u00109\u001a\u00020\u0004H\u0096\u0001J\u0012\u0010:\u001a\u00020\f2\b\b\u0002\u0010;\u001a\u00020\u0012H\u0002J\b\u0010<\u001a\u00020\fH\u0002R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/CameraFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/picture_picker/views/PicturePickerCallback;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/FragmentKycCameraBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/FragmentKycCameraBinding;", "bitmapCallback", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "getBitmapCallback", "()Lkotlin/jvm/functions/Function1;", "setBitmapCallback", "(Lkotlin/jvm/functions/Function1;)V", "enableSelfie", "", "getEnableSelfie", "()Z", "setEnableSelfie", "(Z)V", "onPictureTakenListener", "Lkotlin/Function2;", "", "getOnPictureTakenListener", "()Lkotlin/jvm/functions/Function2;", "setOnPictureTakenListener", "(Lkotlin/jvm/functions/Function2;)V", "picturePicker", "Lai/kudi/agent/picture_picker/ui/PicturePickerFragment;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPermissionDenied", "permission", "onPictureCancelled", "onPictureTaken", "isPictureAvailable", "bitmap", "onPictureUploadFailure", "onPictureUploadSuccessful", "pictureId", "pictureUrl", "onUploadStarted", "onViewCreated", "view", "requireBinding", "toggleActionBtn", "enable", "uploadImage", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.CameraFragment */
/* loaded from: classes.dex */
public final class CameraFragment extends h implements PicturePickerCallback, BaseViewBinder<FragmentKycCameraBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentKycCameraBinding> $$delegate_0;
    private InterfaceC11767l<? super Bitmap, C13666w> bitmapCallback;
    private boolean enableSelfie;
    private InterfaceC11771p<? super String, ? super String, C13666w> onPictureTakenListener;
    private PicturePickerFragment picturePicker;

    /* compiled from: CameraFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/CameraFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/personal/ui/CameraFragment;", "enableSelfie", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.CameraFragment$Companion */
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
        public final CameraFragment newInstance(boolean z) {
            CameraFragment $r1 = new CameraFragment();
            Bundle $r2 = new Bundle();
            $r2.putBoolean("SELFIE_ENABLE", z);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CameraFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40795onViewCreated$lambda1(CameraFragment cameraFragment, View view) {
        Log_OC.getArray(cameraFragment, "this$0");
        cameraFragment.uploadImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m40796onViewCreated$lambda2(CameraFragment cameraFragment, View view) {
        Log_OC.getArray(cameraFragment, "this$0");
        PicturePickerFragment $r2 = cameraFragment.picturePicker;
        if ($r2 == null) {
            return;
        }
        $r2.chooseFromGallery();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleActionBtn(boolean z) {
        FragmentKycCameraBinding $r1 = requireBinding();
        if (z) {
            KudiButton $r2 = $r1.btnContinue;
            $r2.m38033e();
        } else {
            KudiButton $r22 = $r1.btnContinue;
            $r22.m38032f();
        }
        ViewGroup $r23 = $r1.btnContinue;
        ViewGroup r3 = $r23;
        r3.setEnabled(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleActionBtn$default(CameraFragment cameraFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        cameraFragment.toggleActionBtn($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void uploadImage() {
        PicturePickerFragment $r1 = this.picturePicker;
        if ($r1 == null) {
            return;
        }
        $r1.uploadPictureToMediaService();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentKycCameraBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentKycCameraBinding $r3 = (FragmentKycCameraBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentKycCameraBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getBitmapCallback() {
        InterfaceC11767l r1 = this.bitmapCallback;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getEnableSelfie() {
        boolean z0 = this.enableSelfie;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11771p getOnPictureTakenListener() {
        InterfaceC11771p r1 = this.onPictureTakenListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentKycCameraBinding fragmentKycCameraBinding, Fragment fragment) {
        Log_OC.getArray(fragmentKycCameraBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentKycCameraBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentKycCameraBinding $r4 = (FragmentKycCameraBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = C0038R.style.FullScreenDialogStyle;
        setStyle(0, $i0);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        boolean $z0 = $r1.getBoolean("SELFIE_ENABLE", false);
        setEnableSelfie($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentKycCameraBinding $r4 = FragmentKycCameraBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPermissionDenied(String str) {
        Log_OC.getArray(str, "permission");
        FragmentActivity $r2 = getActivity();
        if ($r2 != null) {
            String $r3 = Log_OC.m10359a("Permission denied: ", (Object) str);
            ContextExtKt.toast$default($r2, $r3, 0, 2, (Object) null);
        }
        boolean $z0 = Log_OC.append(str, "android.permission.CAMERA");
        if ($z0) {
            return;
        }
        Log_OC.append(str, "android.permission.READ_EXTERNAL_STORAGE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureCancelled() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        ContextExtKt.toast$default($r1, "Picture cancelled", 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureTaken(boolean z, Bitmap bitmap) {
        Log_OC.getArray(bitmap, "bitmap");
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        ContextExtKt.toast$default($r1, "Picture taken", 0, 2, (Object) null);
    }

    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureUploadFailure() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureUploadSuccessful(String str, Bitmap bitmap, String str2) {
        Log_OC.getArray(str, "pictureId");
        Log_OC.getArray(bitmap, "bitmap");
        Log_OC.getArray(str2, "pictureUrl");
        FragmentActivity $r3 = getActivity();
        if ($r3 != null) {
            ContextExtKt.toast$default($r3, "Picture upload successful", 0, 2, (Object) null);
        }
        toggleActionBtn(true);
        InterfaceC11771p $r5 = this.onPictureTakenListener;
        Log_OC.append($r5);
        $r5.invoke(str, str2);
        InterfaceC11767l $r6 = this.bitmapCallback;
        if ($r6 != null) {
            $r6.invoke(bitmap);
        }
        dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onUploadStarted() {
        FragmentActivity $r1 = getActivity();
        if ($r1 != null) {
            ContextExtKt.toast$default($r1, "Picture upload started", 0, 2, (Object) null);
        }
        toggleActionBtn$default(this, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        boolean $z0 = this.enableSelfie;
        PicturePickerOption r13 = new PicturePickerOption(null, 0, 0, false, false, $z0, true, 23, null);
        PicturePickerFragment.Companion $r4 = PicturePickerFragment.Companion;
        this.picturePicker = $r4.newInstance(this, r13);
        FragmentManager $r6 = getChildFragmentManager();
        AbstractC1449b0 $r7 = $r6.m35924l();
        int $i0 = C0038R.C0040id.container;
        Fragment $r5 = this.picturePicker;
        Log_OC.append($r5);
        Fragment r16 = $r5;
        $r7.m35821r($i0, r16);
        $r7.mo35805i();
        FragmentKycCameraBinding $r8 = requireBinding();
        ViewGroup $r9 = $r8.btnContinue;
        ViewGroup r17 = $r9;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CameraFragment $r2 = CameraFragment.this;
                CameraFragment.m40795onViewCreated$lambda1($r2, view2);
            }
        });
        FragmentKycCameraBinding $r82 = requireBinding();
        TextView $r11 = $r82.pickFromGallery;
        TextView r18 = $r11;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CameraFragment $r2 = CameraFragment.this;
                CameraFragment.m40796onViewCreated$lambda2($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentKycCameraBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentKycCameraBinding $r3 = (FragmentKycCameraBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentKycCameraBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setBitmapCallback(InterfaceC11767l interfaceC11767l) {
        this.bitmapCallback = interfaceC11767l;
    }

    public final void setEnableSelfie(boolean z) {
        this.enableSelfie = z;
    }

    public final void setOnPictureTakenListener(InterfaceC11771p interfaceC11771p) {
        this.onPictureTakenListener = interfaceC11771p;
    }
}
