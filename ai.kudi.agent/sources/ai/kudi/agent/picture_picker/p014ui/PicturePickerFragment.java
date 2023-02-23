package ai.kudi.agent.picture_picker.p014ui;

import ai.kudi.agent.core.databinding.FragmentPicturePickerBinding;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.FileProcessor;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.picture_picker.custom.ApiLevel19AndBelowCameraManager;
import ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager;
import ai.kudi.agent.picture_picker.custom.AutoFitTextureView;
import ai.kudi.agent.picture_picker.domains.models.PicturePickerOption;
import ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment;
import ai.kudi.agent.picture_picker.presenters.PicturePickerPresenter;
import ai.kudi.agent.picture_picker.views.PicturePickerCallback;
import ai.kudi.agent.picture_picker.views.PicturePickerView;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.InputStream;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: PicturePickerFragment.kt */
@Metadata(m10422d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002^_B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0019\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0096\u0001J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\"\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u000106H\u0016J$\u00107\u001a\u00020!2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010<\u001a\u00020\u001cH\u0016J\u0012\u0010=\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00010>H\u0002J\b\u0010?\u001a\u00020\u001cH\u0016J\u0010\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001aH\u0002J$\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020'2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010EH\u0002J-\u0010G\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u000e\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020E0I2\u0006\u0010J\u001a\u00020KH\u0016¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020\u001cH\u0016J\u001a\u0010N\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010P\u001a\u00020\u001cH\u0002J\b\u0010Q\u001a\u00020\u001cH\u0002J\t\u0010R\u001a\u00020\u0005H\u0096\u0001J\b\u0010S\u001a\u00020\u001cH\u0002J\b\u0010T\u001a\u00020\u001cH\u0002J\b\u0010U\u001a\u00020\u001cH\u0002J\u0010\u0010V\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020EH\u0002J\u0012\u0010X\u001a\u00020\u001c2\b\b\u0002\u0010Y\u001a\u00020'H\u0002J\u0012\u0010Z\u001a\u00020\u001c2\b\b\u0002\u0010[\u001a\u00020\\H\u0002J\u0006\u0010]\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, m10421d2 = {"Lai/kudi/agent/picture_picker/ui/PicturePickerFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/picture_picker/views/PicturePickerView;", "Lai/kudi/agent/picture_picker/presenters/PicturePickerPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/FragmentPicturePickerBinding;", "()V", "apiLevel19AndBelowCameraManager", "Lai/kudi/agent/picture_picker/custom/ApiLevel19AndBelowCameraManager;", "apiLevel21AndAboveCameraManager", "Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager;", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/FragmentPicturePickerBinding;", "callback", "Lai/kudi/agent/picture_picker/views/PicturePickerCallback;", "disposable", "Lio/reactivex/disposables/Disposable;", "option", "Lai/kudi/agent/picture_picker/domains/models/PicturePickerOption;", "screenPresenter", "getScreenPresenter", "()Lai/kudi/agent/picture_picker/presenters/PicturePickerPresenter;", "setScreenPresenter", "(Lai/kudi/agent/picture_picker/presenters/PicturePickerPresenter;)V", "selectedImageBitmap", "Landroid/graphics/Bitmap;", "cancelSelectedPicture", "", "chooseFromGallery", "createPresenter", "init", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "initCamera2Api", "initCameraApi", "isCameraPermissionGiven", "", "isLollipopAndAbove", "isMashmallowAndAbove", "isStoragePermissionGiven", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onGalleryPicturePicked", "Landroid/net/Uri;", "onPause", "onPictureCaptured", "bitmap", "onPictureUploadResponse", "isSuccessful", "pictureId", "", "pictureUrl", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "requestCameraPermission", "requestExtStoragePermission", "requireBinding", "setImageView", "setupOtherViews", "showGalleryPicturePicker", "toast", AttributeType.TEXT, "toggleCancelBtn", "enable", "toggleViewState", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Lai/kudi/agent/picture_picker/ui/PicturePickerFragment$ViewState;", "uploadPictureToMediaService", "Companion", "ViewState", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.picture_picker.ui.PicturePickerFragment */
/* loaded from: classes.dex */
public final class PicturePickerFragment extends AbstractC9412c<PicturePickerView, PicturePickerPresenter> implements PicturePickerView, BaseViewBinder<FragmentPicturePickerBinding> {
    public static final Companion Companion;
    private static final String KEY_PICKER_OPTION = "key_picker_option";
    private static final int REQUEST_CODE_CAMERA_PERMISSION = 3;
    private static final int REQUEST_CODE_PICK_FROM_GALLERY = 10;
    private static final int REQUEST_CODE_READ_EXT_STORAGE_PERMISSION = 4;
    private final /* synthetic */ BaseViewBinderImpl<FragmentPicturePickerBinding> $$delegate_0;
    private ApiLevel19AndBelowCameraManager apiLevel19AndBelowCameraManager;
    private ApiLevel21AndAboveCameraManager apiLevel21AndAboveCameraManager;
    private PicturePickerCallback callback;
    private FavoritesArrayAdapter disposable;
    private PicturePickerOption option;
    public PicturePickerPresenter screenPresenter;
    private Bitmap selectedImageBitmap;

    /* compiled from: PicturePickerFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/picture_picker/ui/PicturePickerFragment$Companion;", "", "()V", "KEY_PICKER_OPTION", "", "REQUEST_CODE_CAMERA_PERMISSION", "", "REQUEST_CODE_PICK_FROM_GALLERY", "REQUEST_CODE_READ_EXT_STORAGE_PERMISSION", "newInstance", "Lai/kudi/agent/picture_picker/ui/PicturePickerFragment;", "callback", "Lai/kudi/agent/picture_picker/views/PicturePickerCallback;", "option", "Lai/kudi/agent/picture_picker/domains/models/PicturePickerOption;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.picture_picker.ui.PicturePickerFragment$Companion */
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
        public final PicturePickerFragment newInstance(PicturePickerCallback picturePickerCallback, PicturePickerOption picturePickerOption) {
            Log_OC.getArray(picturePickerCallback, "callback");
            Log_OC.getArray(picturePickerOption, "option");
            PicturePickerFragment r6 = new PicturePickerFragment();
            r6.callback = picturePickerCallback;
            Bundle r7 = new Bundle();
            r7.putParcelable(PicturePickerFragment.KEY_PICKER_OPTION, picturePickerOption);
            C13666w c13666w = C13666w.f30112a;
            PicturePickerFragment r8 = r6;
            r8.setArguments(r7);
            return r6;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PicturePickerFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/picture_picker/ui/PicturePickerFragment$ViewState;", "", "(Ljava/lang/String;I)V", "STATE_CAMERA", "STATE_IMAGE_PREVIEW", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.picture_picker.ui.PicturePickerFragment$ViewState */
    /* loaded from: classes.dex */
    public static final class ViewState {
        private static final /* synthetic */ ViewState[] $VALUES;
        public static final ViewState STATE_CAMERA;
        public static final ViewState STATE_IMAGE_PREVIEW;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private static final /* synthetic */ ViewState[] $values() {
            ViewState $r1 = STATE_CAMERA;
            ViewState $r12 = STATE_IMAGE_PREVIEW;
            ViewState[] $r0 = {$r1, $r12};
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            ViewState $r1 = new ViewState("STATE_CAMERA", 0);
            STATE_CAMERA = $r1;
            ViewState $r12 = new ViewState("STATE_IMAGE_PREVIEW", 1);
            STATE_IMAGE_PREVIEW = $r12;
            ViewState[] $r0 = $values();
            $VALUES = $r0;
        }

        private ViewState(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static ViewState valueOf(String str) {
            Enum $r0 = Enum.valueOf(ViewState.class, str);
            ViewState $r2 = (ViewState) $r0;
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static ViewState[] values() {
            ViewState[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            ViewState[] $r12 = (ViewState[]) $r0;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PicturePickerFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r6 == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void cancelSelectedPicture() {
        /*
            r8 = this;
            r0 = 0
            r8.selectedImageBitmap = r0
            ai.kudi.agent.picture_picker.views.PicturePickerCallback r1 = r8.callback
            if (r1 != 0) goto L8
            goto Lb
        L8:
            r1.onPictureCancelled()
        Lb:
            r2 = 1
            r0 = 0
            r3 = 1
            r4 = 0
            toggleViewState$default(r8, r0, r3, r4)
            ai.kudi.agent.picture_picker.domains.models.PicturePickerOption r5 = r8.option
            if (r5 != 0) goto L18
        L16:
            r2 = 0
            goto L1f
        L18:
            boolean r6 = r5.getEnableAutoUpload()
            r3 = 1
            if (r6 != r3) goto L16
        L1f:
            if (r2 == 0) goto L28
            ai.kudi.agent.picture_picker.presenters.PicturePickerPresenter r7 = r8.getScreenPresenter()
            r7.stopImageUpload()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment.cancelSelectedPicture():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void init() {
        boolean $z0 = isLollipopAndAbove();
        if (!$z0) {
            initCameraApi();
            return;
        }
        boolean $z02 = isCameraPermissionGiven();
        if ($z02) {
            initCamera2Api();
            return;
        }
        boolean $z03 = isMashmallowAndAbove();
        if ($z03) {
            requestCameraPermission();
        } else {
            initCamera2Api();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initCamera2Api() {
        PicturePickerFragment r6 = this;
        FragmentActivity $r2 = r6.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        FragmentPicturePickerBinding $r3 = requireBinding();
        AutoFitTextureView $r4 = $r3.cameraView;
        Log_OC.append($r4);
        Log_OC.loadImage($r4, "requireBinding().cameraView!!");
        ApiLevel21AndAboveCameraManager r5 = new ApiLevel21AndAboveCameraManager($r2, $r4);
        this.apiLevel21AndAboveCameraManager = r5;
        setupOtherViews();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initCameraApi() {
        PicturePickerFragment r7 = this;
        FragmentActivity $r2 = r7.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ApiLevel19AndBelowCameraManager r6 = new ApiLevel19AndBelowCameraManager($r2);
        this.apiLevel19AndBelowCameraManager = r6;
        FragmentPicturePickerBinding $r3 = requireBinding();
        FrameLayout $r4 = $r3.flCameraView;
        if ($r4 != null) {
            ApiLevel19AndBelowCameraManager $r1 = this.apiLevel19AndBelowCameraManager;
            if ($r1 == null) {
                Log_OC.LogError("apiLevel19AndBelowCameraManager");
                NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
                throw r5;
            }
            $r4.addView($r1);
        }
        setupOtherViews();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isCameraPermissionGiven() {
        String[] $r1 = {"android.permission.CAMERA"};
        int $i0 = 0;
        while (true) {
            if ($i0 >= 1) {
                return true;
            }
            String $r2 = $r1[$i0];
            PicturePickerFragment r4 = this;
            FragmentActivity $r3 = r4.requireActivity();
            int $i1 = C1335a.m36327a($r3, $r2);
            boolean $z0 = $i1 == 0;
            if (!$z0) {
                return false;
            }
            $i0++;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isLollipopAndAbove() {
        int $i0 = Build.VERSION.SDK_INT;
        return $i0 >= 21;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isMashmallowAndAbove() {
        int $i0 = Build.VERSION.SDK_INT;
        return $i0 >= 23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isStoragePermissionGiven() {
        String[] $r1 = {"android.permission.READ_EXTERNAL_STORAGE"};
        int $i0 = 0;
        while (true) {
            if ($i0 >= 1) {
                return true;
            }
            String $r2 = $r1[$i0];
            PicturePickerFragment r4 = this;
            FragmentActivity $r3 = r4.requireActivity();
            int $i1 = C1335a.m36327a($r3, $r2);
            boolean $z0 = $i1 == 0;
            if (!$z0) {
                return false;
            }
            $i0++;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onGalleryPicturePicked(Uri uri) {
        if (uri == null) {
            return;
        }
        PicturePickerFragment r6 = this;
        FragmentActivity $r2 = r6.requireActivity();
        ContentResolver $r3 = $r2.getContentResolver();
        InputStream $r4 = $r3.openInputStream(uri);
        Bitmap $r5 = BitmapFactory.decodeStream($r4);
        Log_OC.append($r5);
        onPictureCaptured($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r2 == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPictureCaptured(android.graphics.Bitmap r6) {
        /*
            r5 = this;
            r5.selectedImageBitmap = r6
            ai.kudi.agent.picture_picker.views.PicturePickerCallback r0 = r5.callback
            r1 = 1
            if (r0 != 0) goto L8
            goto L10
        L8:
            if (r6 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r0.onPictureTaken(r2, r6)
        L10:
            r5.setImageView()
            ai.kudi.agent.picture_picker.domains.models.PicturePickerOption r3 = r5.option
            if (r3 != 0) goto L19
        L17:
            r1 = 0
            goto L20
        L19:
            boolean r2 = r3.getEnableAutoUpload()
            r4 = 1
            if (r2 != r4) goto L17
        L20:
            if (r1 == 0) goto L25
            r5.uploadPictureToMediaService()
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment.onPictureCaptured(android.graphics.Bitmap):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onPictureUploadResponse(boolean z, String str, String str2) {
        if (z) {
            PicturePickerCallback $r4 = this.callback;
            if ($r4 != null) {
                Log_OC.append(str);
                Bitmap $r3 = this.selectedImageBitmap;
                Log_OC.append($r3);
                Log_OC.append(str2);
                $r4.onPictureUploadSuccessful(str, $r3, str2);
            }
        } else {
            PicturePickerCallback $r42 = this.callback;
            if ($r42 != null) {
                $r42.onPictureUploadFailure();
            }
        }
        toggleCancelBtn(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestCameraPermission() {
        String[] $r1 = {"android.permission.CAMERA"};
        PicturePickerFragment r2 = this;
        r2.requestPermissions($r1, 3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestExtStoragePermission() {
        String[] $r1 = {"android.permission.READ_EXTERNAL_STORAGE"};
        PicturePickerFragment r2 = this;
        r2.requestPermissions($r1, 4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setImageView() {
        PicturePickerFragment r4 = this;
        FragmentActivity $r2 = r4.requireActivity();
        $r2.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.picture_picker.ui.MonthByWeekFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                PicturePickerFragment $r1 = PicturePickerFragment.this;
                PicturePickerFragment.m40013setImageView$lambda10($r1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setImageView$lambda-10  reason: not valid java name */
    public static final void m40013setImageView$lambda10(PicturePickerFragment picturePickerFragment) {
        Log_OC.getArray(picturePickerFragment, "this$0");
        Bitmap $r1 = picturePickerFragment.selectedImageBitmap;
        if ($r1 != null) {
            FragmentPicturePickerBinding $r2 = picturePickerFragment.requireBinding();
            ImageView $r3 = $r2.ivSelectedImage;
            Bitmap $r12 = picturePickerFragment.selectedImageBitmap;
            $r3.setImageBitmap($r12);
            ViewState $r4 = ViewState.STATE_IMAGE_PREVIEW;
            picturePickerFragment.toggleViewState($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupOtherViews() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment.setupOtherViews():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupOtherViews$lambda-8$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40014setupOtherViews$lambda8$lambda4$lambda3(PicturePickerFragment picturePickerFragment, View view) {
        Log_OC.getArray(picturePickerFragment, "this$0");
        picturePickerFragment.chooseFromGallery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupOtherViews$lambda-8$lambda-5  reason: not valid java name */
    public static final void m40015setupOtherViews$lambda8$lambda5(PicturePickerFragment picturePickerFragment, View view) {
        Log_OC.getArray(picturePickerFragment, "this$0");
        boolean $z0 = picturePickerFragment.isLollipopAndAbove();
        if ($z0) {
            ApiLevel21AndAboveCameraManager $r2 = picturePickerFragment.apiLevel21AndAboveCameraManager;
            if ($r2 != null) {
                $r2.switchCamera();
                return;
            }
            Log_OC.LogError("apiLevel21AndAboveCameraManager");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        ApiLevel19AndBelowCameraManager $r3 = picturePickerFragment.apiLevel19AndBelowCameraManager;
        if ($r3 != null) {
            $r3.switchCamera();
            return;
        }
        Log_OC.LogError("apiLevel19AndBelowCameraManager");
        NullPointerException r42 = new NullPointerException("Null throw statement replaced by Soot");
        throw r42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupOtherViews$lambda-8$lambda-6  reason: not valid java name */
    public static final void m40016setupOtherViews$lambda8$lambda6(PicturePickerFragment picturePickerFragment, View view) {
        Log_OC.getArray(picturePickerFragment, "this$0");
        boolean $z0 = picturePickerFragment.isLollipopAndAbove();
        if ($z0) {
            ApiLevel21AndAboveCameraManager $r2 = picturePickerFragment.apiLevel21AndAboveCameraManager;
            if ($r2 != null) {
                PicturePickerFragment$setupOtherViews$1$3$1 $r3 = new PicturePickerFragment$setupOtherViews$1$3$1(picturePickerFragment);
                $r2.takePhoto($r3);
                return;
            }
            Log_OC.LogError("apiLevel21AndAboveCameraManager");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        ApiLevel19AndBelowCameraManager $r4 = picturePickerFragment.apiLevel19AndBelowCameraManager;
        if ($r4 != null) {
            PicturePickerFragment$setupOtherViews$1$3$2 $r5 = new PicturePickerFragment$setupOtherViews$1$3$2(picturePickerFragment);
            $r4.takePhoto($r5);
            return;
        }
        Log_OC.LogError("apiLevel19AndBelowCameraManager");
        NullPointerException r62 = new NullPointerException("Null throw statement replaced by Soot");
        throw r62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupOtherViews$lambda-8$lambda-7  reason: not valid java name */
    public static final void m40017setupOtherViews$lambda8$lambda7(PicturePickerFragment picturePickerFragment, View view) {
        Log_OC.getArray(picturePickerFragment, "this$0");
        picturePickerFragment.cancelSelectedPicture();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showGalleryPicturePicker() {
        Intent r2 = new Intent();
        r2.setAction("android.intent.action.PICK");
        r2.setType("image/*");
        r2.putExtra("android.intent.extra.LOCAL_ONLY", true);
        PicturePickerFragment r3 = this;
        r3.startActivityForResult(r2, 10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toast(String str) {
        PicturePickerFragment r3 = this;
        FragmentActivity $r2 = r3.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleCancelBtn(boolean z) {
        FragmentPicturePickerBinding $r1 = requireBinding();
        FrameLayout $r2 = $r1.flCancel;
        if ($r2 == null) {
            return;
        }
        $r2.setEnabled(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleCancelBtn$default(PicturePickerFragment picturePickerFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        picturePickerFragment.toggleCancelBtn($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleViewState(final ViewState viewState) {
        final FragmentPicturePickerBinding $r3 = requireBinding();
        PicturePickerFragment r6 = this;
        FragmentActivity $r4 = r6.requireActivity();
        $r4.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.picture_picker.ui.InitiationListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                PicturePickerFragment.ViewState $r1 = PicturePickerFragment.ViewState.this;
                FragmentPicturePickerBinding $r2 = $r3;
                PicturePickerFragment $r32 = this;
                PicturePickerFragment.m40018toggleViewState$lambda12$lambda11($r1, $r2, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleViewState$default(PicturePickerFragment picturePickerFragment, ViewState $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = ViewState.STATE_CAMERA;
        }
        picturePickerFragment.toggleViewState($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: toggleViewState$lambda-12$lambda-11  reason: not valid java name */
    public static final void m40018toggleViewState$lambda12$lambda11(ViewState viewState, FragmentPicturePickerBinding fragmentPicturePickerBinding, PicturePickerFragment picturePickerFragment) {
        Log_OC.getArray(viewState, "$state");
        Log_OC.getArray(fragmentPicturePickerBinding, "$this_apply");
        Log_OC.getArray(picturePickerFragment, "this$0");
        ViewState $r3 = ViewState.STATE_CAMERA;
        if (viewState == $r3) {
            ViewGroup $r4 = fragmentPicturePickerBinding.clPreviewState;
            ViewGroup r5 = $r4;
            r5.setVisibility(8);
            ViewGroup $r42 = fragmentPicturePickerBinding.clCameraState;
            ViewGroup r52 = $r42;
            r52.setVisibility(0);
            picturePickerFragment.setImageView();
            return;
        }
        ViewState $r32 = ViewState.STATE_IMAGE_PREVIEW;
        if (viewState == $r32) {
            ViewGroup $r43 = fragmentPicturePickerBinding.clPreviewState;
            ViewGroup r53 = $r43;
            r53.setVisibility(0);
            ViewGroup $r44 = fragmentPicturePickerBinding.clCameraState;
            ViewGroup r54 = $r44;
            r54.setVisibility(8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void chooseFromGallery() {
        PicturePickerOption $r1 = this.option;
        boolean $z0 = false;
        if ($r1 != null) {
            boolean $z1 = $r1.getEnableGallerySelection();
            if (!$z1) {
                $z0 = true;
            }
        }
        if ($z0) {
            toast("Gallery selection not allowed");
        } else if (isMashmallowAndAbove()) {
            requestExtStoragePermission();
        } else {
            showGalleryPicturePicker();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public PicturePickerPresenter createPresenter() {
        PicturePickerPresenter $r1 = getScreenPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPicturePickerBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPicturePickerBinding $r3 = (FragmentPicturePickerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPicturePickerBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PicturePickerPresenter getScreenPresenter() {
        PicturePickerPresenter $r1 = this.screenPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPicturePickerBinding fragmentPicturePickerBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPicturePickerBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPicturePickerBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPicturePickerBinding $r4 = (FragmentPicturePickerBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || i2 != -1) {
            init();
        } else if (i == 10) {
            Uri $r2 = intent.getData();
            onGalleryPicturePicked($r2);
        } else {
            PicturePickerFragment r3 = this;
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        PicturePickerFragment r2 = this;
        C7429a.m18752b(r2);
        PicturePickerFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PicturePickerFragment r4 = this;
        Bundle $r1 = r4.getArguments();
        if ($r1 == null) {
            return;
        }
        boolean $z0 = $r1.containsKey(KEY_PICKER_OPTION);
        if ($z0) {
            PicturePickerFragment r42 = this;
            Parcelable $r2 = r42.requireArguments().getParcelable(KEY_PICKER_OPTION);
            PicturePickerOption $r3 = (PicturePickerOption) $r2;
            this.option = $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPicturePickerBinding $r4 = FragmentPicturePickerBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        PicturePickerFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 != null) {
            Log_OC.append($r1);
            $r1.backup();
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onPause() {
        boolean $z0 = isLollipopAndAbove();
        if ($z0) {
            ApiLevel21AndAboveCameraManager $r1 = this.apiLevel21AndAboveCameraManager;
            if ($r1 != null) {
                if ($r1 == null) {
                    Log_OC.LogError("apiLevel21AndAboveCameraManager");
                    NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r3;
                }
                $r1.close();
            }
        } else {
            ApiLevel19AndBelowCameraManager $r2 = this.apiLevel19AndBelowCameraManager;
            if ($r2 != null) {
                if ($r2 == null) {
                    Log_OC.LogError("apiLevel19AndBelowCameraManager");
                    NullPointerException r32 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r32;
                }
                $r2.pauseCamera();
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        int $i1 = strArr.length;
        boolean $z0 = $i1 == 0;
        if ($z0) {
            return;
        }
        if (i == 3) {
            boolean $z02 = isCameraPermissionGiven();
            if ($z02) {
                initCamera2Api();
                return;
            }
            PicturePickerCallback $r3 = this.callback;
            Log_OC.append($r3);
            $r3.onPermissionDenied("android.permission.CAMERA");
        } else if (i == 4) {
            boolean $z03 = isStoragePermissionGiven();
            if ($z03) {
                showGalleryPicturePicker();
                return;
            }
            PicturePickerCallback $r32 = this.callback;
            Log_OC.append($r32);
            $r32.onPermissionDenied("android.permission.READ_EXTERNAL_STORAGE");
        }
        PicturePickerFragment r4 = this;
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean $z0 = isLollipopAndAbove();
        if ($z0) {
            ApiLevel21AndAboveCameraManager $r1 = this.apiLevel21AndAboveCameraManager;
            if ($r1 != null) {
                if ($r1 != null) {
                    $r1.onResume();
                    return;
                }
                Log_OC.LogError("apiLevel21AndAboveCameraManager");
                NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
                throw r3;
            }
            return;
        }
        ApiLevel19AndBelowCameraManager $r2 = this.apiLevel19AndBelowCameraManager;
        if ($r2 != null) {
            if ($r2 != null) {
                $r2.resumeCamera();
                return;
            }
            Log_OC.LogError("apiLevel19AndBelowCameraManager");
            NullPointerException r32 = new NullPointerException("Null throw statement replaced by Soot");
            throw r32;
        }
    }

    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        init();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPicturePickerBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPicturePickerBinding $r3 = (FragmentPicturePickerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPicturePickerBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setScreenPresenter(PicturePickerPresenter picturePickerPresenter) {
        Log_OC.getArray(picturePickerPresenter, "<set-?>");
        this.screenPresenter = picturePickerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadPictureToMediaService() {
        if (this.selectedImageBitmap == null) {
            return;
        }
        PicturePickerCallback $r2 = this.callback;
        if ($r2 != null) {
            $r2.onUploadStarted();
        }
        toggleCancelBtn$default(this, false, 1, null);
        PicturePickerPresenter $r3 = getScreenPresenter();
        FileProcessor.Companion $r4 = FileProcessor.Companion;
        PicturePickerFragment r9 = this;
        Context $r5 = r9.requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        Bitmap $r1 = this.selectedImageBitmap;
        Log_OC.append($r1);
        String $r6 = FileProcessor.Companion.getCompressedBitmapFilePathFrom$default($r4, $r5, $r1, 0, null, 12, null);
        Log_OC.append($r6);
        PicturePickerFragment$uploadPictureToMediaService$1 r8 = new PicturePickerFragment$uploadPictureToMediaService$1(this);
        $r3.uploadImage($r6, r8);
    }
}
