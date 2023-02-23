package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment;
import ai.kudi.agent.picture_picker.domains.models.PicturePickerOption;
import ai.kudi.agent.picture_picker.views.ImagePickerCallback;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CameraFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J \u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0006H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\u001a\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u000fJ\b\u00107\u001a\u00020\u0007H\u0002R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/CameraFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/picture_picker/views/ImagePickerCallback;", "()V", "bitmapCallback", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "getBitmapCallback", "()Lkotlin/jvm/functions/Function1;", "setBitmapCallback", "(Lkotlin/jvm/functions/Function1;)V", "continueBtn", "Lai/kudi/dip/library/button/KudiButton;", "enableSelfie", "", "getEnableSelfie", "()Z", "setEnableSelfie", "(Z)V", "imagePickerFragment", "Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment;", "onPictureTakenListener", "Lkotlin/Function2;", "", "getOnPictureTakenListener", "()Lkotlin/jvm/functions/Function2;", "setOnPictureTakenListener", "(Lkotlin/jvm/functions/Function2;)V", "tvPickFromGalleryBtn", "Lai/kudi/dip/library/button/KudiTextView;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPermissionDenied", "permission", "onPictureCancelled", "onPictureTaken", "isPictureAvailable", "bitmap", "onPictureUploadFailure", "onPictureUploadSuccessful", "pictureId", "pictureUrl", "onUploadStarted", "onViewCreated", "view", "toggleActionBtn", "enable", "uploadImage", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.CameraFragment */
/* loaded from: classes.dex */
public final class CameraFragment extends Chapter implements ImagePickerCallback {
    public static final Companion Companion;
    public static final String ENABLE_SELFIE = "SELFIE_ENABLE";
    private InterfaceC11767l<? super Bitmap, C13666w> bitmapCallback;
    private KudiButton continueBtn;
    private boolean enableSelfie;
    private ImagePickerFragment imagePickerFragment;
    private InterfaceC11771p<? super String, ? super String, C13666w> onPictureTakenListener;
    private KudiTextView tvPickFromGalleryBtn;

    /* compiled from: CameraFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/CameraFragment$Companion;", "", "()V", "ENABLE_SELFIE", "", "newInstance", "Lai/kudi/agent/v2/common/view/fragment/CameraFragment;", "enableSelfie", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.fragment.CameraFragment$Companion */
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m41551onViewCreated$lambda1(CameraFragment cameraFragment, View view) {
        Log_OC.getArray(cameraFragment, "this$0");
        cameraFragment.uploadImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m41552onViewCreated$lambda2(CameraFragment cameraFragment, View view) {
        Log_OC.getArray(cameraFragment, "this$0");
        ImagePickerFragment $r2 = cameraFragment.imagePickerFragment;
        if ($r2 == null) {
            return;
        }
        $r2.chooseFromGallery();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleActionBtn$default(CameraFragment cameraFragment, boolean $z0, int i, Object obj) {
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
        ImagePickerFragment $r1 = this.imagePickerFragment;
        if ($r1 == null) {
            return;
        }
        $r1.uploadPictureToMediaService();
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
    @Override // androidx.fragment.app.Chapter, androidx.fragment.app.Fragment
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
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        int $i0 = C0038R.C0041layout.fragment_kyc_camera;
        View $r4 = layoutInflater.inflate($i0, viewGroup, false);
        int $i02 = C0038R.C0040id.btn_continue;
        View $r5 = $r4.findViewById($i02);
        KudiButton $r6 = (KudiButton) $r5;
        this.continueBtn = $r6;
        int $i03 = C0038R.C0040id.pick_from_gallery;
        View $r52 = $r4.findViewById($i03);
        KudiTextView $r7 = (KudiTextView) $r52;
        this.tvPickFromGalleryBtn = $r7;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.ImagePickerCallback
    public void onPermissionDenied(String str) {
        FragmentActivity $r2;
        Log_OC.getArray(str, "permission");
        FragmentActivity $r22 = getActivity();
        if ($r22 != null) {
            String $r3 = Log_OC.m10359a("Permission denied: ", (Object) str);
            ContextExtKt.toast$default($r22, $r3, 0, 2, (Object) null);
        }
        boolean $z0 = Log_OC.append(str, "android.permission.CAMERA");
        if ($z0) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                return;
            }
            ContextExtKt.toast$default($r23, "Grant permission to access Camera", 0, 2, (Object) null);
            return;
        }
        boolean $z02 = Log_OC.append(str, "android.permission.READ_EXTERNAL_STORAGE");
        if (!$z02 || ($r2 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r2, "Grant permission to access Storage", 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.ImagePickerCallback
    public void onPictureCancelled() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        ContextExtKt.toast$default($r1, "Image cancelled", 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.ImagePickerCallback
    public void onPictureTaken(boolean z, Bitmap bitmap) {
        Log_OC.getArray(bitmap, "bitmap");
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        ContextExtKt.toast$default($r1, "Image taken", 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.ImagePickerCallback
    public void onPictureUploadFailure() {
        Context $r1 = requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        ContextExtKt.toast$default($r1, "Picture upload failed, try again", 0, 2, (Object) null);
        toggleActionBtn(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.ImagePickerCallback
    public void onPictureUploadSuccessful(String str, String str2, Bitmap bitmap) {
        Log_OC.getArray(str, "pictureId");
        Log_OC.getArray(str2, "pictureUrl");
        Log_OC.getArray(bitmap, "bitmap");
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
    @Override // ai.kudi.agent.picture_picker.views.ImagePickerCallback
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
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        boolean $z0 = this.enableSelfie;
        PicturePickerOption r12 = new PicturePickerOption(null, 0, 0, false, false, $z0, true, 23, null);
        ImagePickerFragment.Companion $r4 = ImagePickerFragment.Companion;
        this.imagePickerFragment = $r4.newInstance(this, r12);
        FragmentManager $r6 = getChildFragmentManager();
        AbstractC1449b0 $r7 = $r6.m35924l();
        int $i0 = C0038R.C0040id.container;
        ImagePickerFragment $r5 = this.imagePickerFragment;
        Log_OC.append($r5);
        $r7.m35821r($i0, $r5);
        $r7.mo35805i();
        ViewGroup $r8 = this.continueBtn;
        if ($r8 != null) {
            ViewGroup r15 = $r8;
            r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.view.fragment.FileSelectionFragment$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CameraFragment $r2 = CameraFragment.this;
                    CameraFragment.m41551onViewCreated$lambda1($r2, view2);
                }
            });
        }
        TextView $r10 = this.tvPickFromGalleryBtn;
        if ($r10 == null) {
            return;
        }
        TextView r16 = $r10;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.view.fragment.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CameraFragment $r2 = CameraFragment.this;
                CameraFragment.m41552onViewCreated$lambda2($r2, view2);
            }
        });
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleActionBtn(boolean z) {
        if (z) {
            KudiButton $r1 = this.continueBtn;
            if ($r1 != null) {
                $r1.m38033e();
            }
        } else {
            KudiButton $r12 = this.continueBtn;
            if ($r12 != null) {
                $r12.m38032f();
            }
        }
        ViewGroup $r13 = this.continueBtn;
        if ($r13 == null) {
            return;
        }
        ViewGroup r2 = $r13;
        r2.setEnabled(z);
    }
}
