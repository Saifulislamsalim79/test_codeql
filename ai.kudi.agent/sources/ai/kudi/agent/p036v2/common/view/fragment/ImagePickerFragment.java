package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.FileProcessor;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment;
import ai.kudi.agent.p036v2.common.view.viewData.MediaUploadViewData;
import ai.kudi.agent.p036v2.common.view.viewModels.MediaUploadViewModel;
import ai.kudi.agent.picture_picker.custom.ApiLevel19AndBelowCameraManager;
import ai.kudi.agent.picture_picker.custom.ApiLevel21AndAboveCameraManager;
import ai.kudi.agent.picture_picker.custom.AutoFitTextureView;
import ai.kudi.agent.picture_picker.domains.models.PicturePickerOption;
import ai.kudi.agent.picture_picker.views.ImagePickerCallback;
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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Service;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.InputStream;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: ImagePickerFragment.kt */
@Metadata(m10422d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002noB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020,H\u0002J\u0006\u00100\u001a\u00020,J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020,H\u0002J\b\u00103\u001a\u00020,H\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000205H\u0002J\b\u00108\u001a\u000205H\u0002J\"\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010B\u001a\u00020,2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J&\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010K\u001a\u00020,H\u0016J\b\u0010L\u001a\u00020,H\u0017J\u0012\u0010M\u001a\u00020,2\b\u0010=\u001a\u0004\u0018\u00010NH\u0002J\b\u0010O\u001a\u00020,H\u0016J\u0010\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020&H\u0002J.\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u0002052\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010W\u001a\u0004\u0018\u00010UH\u0002J-\u0010X\u001a\u00020,2\u0006\u0010:\u001a\u00020;2\u000e\u0010Y\u001a\n\u0012\u0006\b\u0001\u0012\u00020U0Z2\u0006\u0010[\u001a\u00020\\H\u0016¢\u0006\u0002\u0010]J\b\u0010^\u001a\u00020,H\u0016J\u001a\u0010_\u001a\u00020,2\u0006\u0010`\u001a\u00020F2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010a\u001a\u00020,H\u0002J\b\u0010b\u001a\u00020,H\u0002J\b\u0010c\u001a\u00020,H\u0002J\b\u0010d\u001a\u00020,H\u0002J\b\u0010e\u001a\u00020,H\u0002J\u0010\u0010f\u001a\u00020,2\u0006\u0010g\u001a\u00020UH\u0002J\u0012\u0010h\u001a\u00020,2\b\b\u0002\u0010i\u001a\u000205H\u0002J\u0012\u0010j\u001a\u00020,2\b\b\u0002\u0010k\u001a\u00020lH\u0002J\u0006\u0010m\u001a\u00020,R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006p"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleObserver;", "Lai/kudi/agent/picture_picker/views/PicturePickerView;", "()V", "apiLevel19AndBelowCameraManager", "Lai/kudi/agent/picture_picker/custom/ApiLevel19AndBelowCameraManager;", "apiLevel21AndAboveCameraManager", "Lai/kudi/agent/picture_picker/custom/ApiLevel21AndAboveCameraManager;", "callback", "Lai/kudi/agent/picture_picker/views/ImagePickerCallback;", "cameraView", "Lai/kudi/agent/picture_picker/custom/AutoFitTextureView;", "clCameraState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "disposable", "Lio/reactivex/disposables/Disposable;", "flCameraView", "Landroid/widget/FrameLayout;", "flCancel", "flCapture", "flGalleryView", "flRotateCamera", "ivFocusFrame", "Landroid/widget/ImageView;", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "mediaUploadViewModel", "Lai/kudi/agent/v2/common/view/viewModels/MediaUploadViewModel;", "getMediaUploadViewModel", "()Lai/kudi/agent/v2/common/view/viewModels/MediaUploadViewModel;", "setMediaUploadViewModel", "(Lai/kudi/agent/v2/common/view/viewModels/MediaUploadViewModel;)V", "option", "Lai/kudi/agent/picture_picker/domains/models/PicturePickerOption;", "previewContainer", "selectedImage", "selectedImageBitmap", "Landroid/graphics/Bitmap;", "tvPrompt", "Landroid/widget/TextView;", "viewLifecycle", "Landroidx/lifecycle/Lifecycle;", "applyViewData", "", "viewData", "Lai/kudi/agent/v2/common/view/viewData/MediaUploadViewData;", "cancelSelectedPicture", "chooseFromGallery", "init", "initCamera2Api", "initCameraApi", "isCameraPermissionGiven", "", "isLollipopAndAbove", "isMashmallowAndAbove", "isStoragePermissionGiven", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onGalleryPicturePicked", "Landroid/net/Uri;", "onPause", "onPictureCaptured", "bitmap", "onPictureUploadResponse", "isSuccessful", "imageId", "", "imageUrl", "errorMessage", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "requestCameraPermission", "requestExtStoragePermission", "setImageView", "setupOtherViews", "showGalleryPicturePicker", "toast", AttributeType.TEXT, "toggleCancelBtn", "enable", "toggleViewState", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment$ViewState;", "uploadPictureToMediaService", "Companion", "ViewState", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.ImagePickerFragment */
/* loaded from: classes.dex */
public final class ImagePickerFragment extends Fragment implements Service, PicturePickerView {
    public static final Companion Companion;
    private static final String KEY_PICKER_OPTION = "KEY_PICKER_OPTION";
    private static final int REQUEST_CODE_CAMERA_PERMISSION = 9;
    private static final int REQUEST_CODE_PICK_FROM_GALLERY = 110;
    private static final int REQUEST_CODE_READ_EXT_STORAGE_PERMISSION = 24;
    private ApiLevel19AndBelowCameraManager apiLevel19AndBelowCameraManager;
    private ApiLevel21AndAboveCameraManager apiLevel21AndAboveCameraManager;
    private ImagePickerCallback callback;
    private AutoFitTextureView cameraView;
    private ConstraintLayout clCameraState;
    private FavoritesArrayAdapter disposable;
    private FrameLayout flCameraView;
    private FrameLayout flCancel;
    private FrameLayout flCapture;
    private FrameLayout flGalleryView;
    private FrameLayout flRotateCamera;
    private ImageView ivFocusFrame;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    public MediaUploadViewModel mediaUploadViewModel;
    private PicturePickerOption option;
    private ConstraintLayout previewContainer;
    private ImageView selectedImage;
    private Bitmap selectedImageBitmap;
    private TextView tvPrompt;
    private AbstractC1565i viewLifecycle;

    /* compiled from: ImagePickerFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment$Companion;", "", "()V", ImagePickerFragment.KEY_PICKER_OPTION, "", "REQUEST_CODE_CAMERA_PERMISSION", "", "REQUEST_CODE_PICK_FROM_GALLERY", "REQUEST_CODE_READ_EXT_STORAGE_PERMISSION", "newInstance", "Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment;", "callback", "Lai/kudi/agent/picture_picker/views/ImagePickerCallback;", "option", "Lai/kudi/agent/picture_picker/domains/models/PicturePickerOption;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.fragment.ImagePickerFragment$Companion */
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
        public final ImagePickerFragment newInstance(ImagePickerCallback imagePickerCallback, PicturePickerOption picturePickerOption) {
            Log_OC.getArray(imagePickerCallback, "callback");
            Log_OC.getArray(picturePickerOption, "option");
            ImagePickerFragment $r3 = new ImagePickerFragment();
            $r3.callback = imagePickerCallback;
            Bundle $r4 = new Bundle();
            $r4.putParcelable(ImagePickerFragment.KEY_PICKER_OPTION, picturePickerOption);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r4);
            return $r3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImagePickerFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment$ViewState;", "", "(Ljava/lang/String;I)V", "STATE_CAMERA", "STATE_IMAGE_PREVIEW", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.fragment.ImagePickerFragment$ViewState */
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
    private final void applyViewData(MediaUploadViewData mediaUploadViewData) {
        boolean $z0 = mediaUploadViewData instanceof MediaUploadViewData.UploadResponse;
        if ($z0) {
            MediaUploadViewData.UploadResponse $r2 = (MediaUploadViewData.UploadResponse) mediaUploadViewData;
            boolean $z02 = $r2.getUploadSuccessful();
            String $r3 = $r2.getFileId();
            String $r4 = $r2.getFileUrl();
            String $r5 = $r2.getErrorMessage();
            onPictureUploadResponse($z02, $r3, $r4, $r5);
        }
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
            ai.kudi.agent.picture_picker.views.ImagePickerCallback r1 = r8.callback
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
            ai.kudi.agent.v2.common.view.viewModels.MediaUploadViewModel r7 = r8.getMediaUploadViewModel()
            r7.stopFileUpload()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment.cancelSelectedPicture():void");
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
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        AutoFitTextureView $r3 = this.cameraView;
        Log_OC.append($r3);
        ApiLevel21AndAboveCameraManager $r1 = new ApiLevel21AndAboveCameraManager($r2, $r3);
        this.apiLevel21AndAboveCameraManager = $r1;
        setupOtherViews();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initCameraApi() {
        FragmentActivity $r1 = requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ApiLevel19AndBelowCameraManager $r2 = new ApiLevel19AndBelowCameraManager($r1);
        this.apiLevel19AndBelowCameraManager = $r2;
        FrameLayout $r3 = this.flCameraView;
        if ($r3 != null) {
            if ($r2 == null) {
                Log_OC.LogError("apiLevel19AndBelowCameraManager");
                NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
                throw r4;
            }
            $r3.addView($r2);
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
            FragmentActivity $r3 = requireActivity();
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
            FragmentActivity $r3 = requireActivity();
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
        FragmentActivity $r2 = requireActivity();
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
            ai.kudi.agent.picture_picker.views.ImagePickerCallback r0 = r5.callback
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment.onPictureCaptured(android.graphics.Bitmap):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onPictureUploadResponse(boolean z, String str, String str2, String str3) {
        if (!z) {
            ImagePickerCallback $r4 = this.callback;
            if ($r4 != null) {
                $r4.onPictureUploadFailure();
            }
        } else if (str3 != null) {
            ImagePickerCallback $r42 = this.callback;
            if ($r42 != null) {
                $r42.onPictureUploadFailure();
            }
        } else {
            ImagePickerCallback $r43 = this.callback;
            if ($r43 != null) {
                Log_OC.append(str);
                Log_OC.append(str2);
                Bitmap $r5 = this.selectedImageBitmap;
                Log_OC.append($r5);
                $r43.onPictureUploadSuccessful(str, str2, $r5);
            }
        }
        toggleCancelBtn(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m41553onViewCreated$lambda1(ImagePickerFragment imagePickerFragment, MediaUploadViewData mediaUploadViewData) {
        Log_OC.getArray(imagePickerFragment, "this$0");
        Log_OC.loadImage(mediaUploadViewData, "it");
        imagePickerFragment.applyViewData(mediaUploadViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestCameraPermission() {
        String[] $r1 = {"android.permission.CAMERA"};
        requestPermissions($r1, 9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestExtStoragePermission() {
        String[] $r1 = {"android.permission.READ_EXTERNAL_STORAGE"};
        requestPermissions($r1, 24);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setImageView() {
        FragmentActivity $r2 = requireActivity();
        $r2.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.v2.common.view.fragment.EventInfoFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickerFragment $r1 = ImagePickerFragment.this;
                ImagePickerFragment.m41555setImageView$lambda11($r1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setImageView$lambda-11  reason: not valid java name */
    public static final void m41555setImageView$lambda11(ImagePickerFragment imagePickerFragment) {
        Log_OC.getArray(imagePickerFragment, "this$0");
        Bitmap $r2 = imagePickerFragment.selectedImageBitmap;
        if ($r2 != null) {
            ImageView $r1 = imagePickerFragment.selectedImage;
            if ($r1 != null) {
                $r1.setImageBitmap($r2);
            }
            ViewState $r3 = ViewState.STATE_IMAGE_PREVIEW;
            imagePickerFragment.toggleViewState($r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupOtherViews() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment.setupOtherViews():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupOtherViews$lambda-6$lambda-5  reason: not valid java name */
    public static final void m41556setupOtherViews$lambda6$lambda5(ImagePickerFragment imagePickerFragment, View view) {
        Log_OC.getArray(imagePickerFragment, "this$0");
        imagePickerFragment.chooseFromGallery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupOtherViews$lambda-7  reason: not valid java name */
    public static final void m41557setupOtherViews$lambda7(ImagePickerFragment imagePickerFragment, View view) {
        Log_OC.getArray(imagePickerFragment, "this$0");
        boolean $z0 = imagePickerFragment.isLollipopAndAbove();
        if ($z0) {
            ApiLevel21AndAboveCameraManager $r2 = imagePickerFragment.apiLevel21AndAboveCameraManager;
            if ($r2 != null) {
                $r2.switchCamera();
                return;
            }
            Log_OC.LogError("apiLevel21AndAboveCameraManager");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        ApiLevel19AndBelowCameraManager $r3 = imagePickerFragment.apiLevel19AndBelowCameraManager;
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
    /* renamed from: setupOtherViews$lambda-8  reason: not valid java name */
    public static final void m41558setupOtherViews$lambda8(ImagePickerFragment imagePickerFragment, View view) {
        Log_OC.getArray(imagePickerFragment, "this$0");
        boolean $z0 = imagePickerFragment.isLollipopAndAbove();
        if ($z0) {
            ApiLevel21AndAboveCameraManager $r2 = imagePickerFragment.apiLevel21AndAboveCameraManager;
            if ($r2 != null) {
                ImagePickerFragment$setupOtherViews$3$1 $r3 = new ImagePickerFragment$setupOtherViews$3$1(imagePickerFragment);
                $r2.takePhoto($r3);
                return;
            }
            Log_OC.LogError("apiLevel21AndAboveCameraManager");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        ApiLevel19AndBelowCameraManager $r4 = imagePickerFragment.apiLevel19AndBelowCameraManager;
        if ($r4 != null) {
            ImagePickerFragment$setupOtherViews$3$2 $r5 = new ImagePickerFragment$setupOtherViews$3$2(imagePickerFragment);
            $r4.takePhoto($r5);
            return;
        }
        Log_OC.LogError("apiLevel19AndBelowCameraManager");
        NullPointerException r62 = new NullPointerException("Null throw statement replaced by Soot");
        throw r62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupOtherViews$lambda-9  reason: not valid java name */
    public static final void m41559setupOtherViews$lambda9(ImagePickerFragment imagePickerFragment, View view) {
        Log_OC.getArray(imagePickerFragment, "this$0");
        imagePickerFragment.cancelSelectedPicture();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showGalleryPicturePicker() {
        Intent $r1 = new Intent();
        $r1.setAction("android.intent.action.PICK");
        $r1.setType("image/*");
        $r1.putExtra("android.intent.extra.LOCAL_ONLY", true);
        startActivityForResult($r1, 110);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toast(String str) {
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleCancelBtn(boolean z) {
        FrameLayout $r1 = this.flCancel;
        if ($r1 == null) {
            return;
        }
        $r1.setEnabled(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleCancelBtn$default(ImagePickerFragment imagePickerFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        imagePickerFragment.toggleCancelBtn($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleViewState(final ViewState viewState) {
        FragmentActivity $r3 = requireActivity();
        $r3.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.v2.common.view.fragment.InitiationListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickerFragment.ViewState $r1 = ImagePickerFragment.ViewState.this;
                ImagePickerFragment $r2 = this;
                ImagePickerFragment.m41560toggleViewState$lambda12($r1, $r2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleViewState$default(ImagePickerFragment imagePickerFragment, ViewState $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = ViewState.STATE_CAMERA;
        }
        imagePickerFragment.toggleViewState($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: toggleViewState$lambda-12  reason: not valid java name */
    public static final void m41560toggleViewState$lambda12(ViewState viewState, ImagePickerFragment imagePickerFragment) {
        Log_OC.getArray(viewState, "$state");
        Log_OC.getArray(imagePickerFragment, "this$0");
        ViewState $r2 = ViewState.STATE_CAMERA;
        if (viewState == $r2) {
            ViewGroup $r3 = imagePickerFragment.previewContainer;
            if ($r3 != null) {
                ViewGroup r4 = $r3;
                r4.setVisibility(8);
            }
            ViewGroup $r32 = imagePickerFragment.clCameraState;
            if ($r32 != null) {
                ViewGroup r42 = $r32;
                r42.setVisibility(0);
            }
            imagePickerFragment.setImageView();
            return;
        }
        ViewState $r22 = ViewState.STATE_IMAGE_PREVIEW;
        if (viewState == $r22) {
            ViewGroup $r33 = imagePickerFragment.previewContainer;
            if ($r33 != null) {
                ViewGroup r43 = $r33;
                r43.setVisibility(0);
            }
            ViewGroup $r34 = imagePickerFragment.clCameraState;
            if ($r34 == null) {
                return;
            }
            ViewGroup r44 = $r34;
            r44.setVisibility(8);
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
    public final MediaUploadViewModel getMediaUploadViewModel() {
        MediaUploadViewModel $r1 = this.mediaUploadViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("mediaUploadViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || i2 != -1) {
            init();
        } else if (i != 110) {
            super.onActivityResult(i, i2, intent);
        } else {
            Uri $r2 = intent.getData();
            onGalleryPicturePicked($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        MarketplaceProductLookupSubComponent $r3;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof MarketplaceLookupActivity;
        if ($z0) {
            this.marketplaceLookupActivity = (MarketplaceLookupActivity) context;
        }
        MarketplaceLookupActivity $r2 = this.marketplaceLookupActivity;
        if ($r2 != null && ($r3 = $r2.getMarketplaceLookupSubcomponent()) != null) {
            $r3.inject(this);
        }
        AbstractC1565i $r4 = this.viewLifecycle;
        if ($r4 != null) {
            $r4.a(this);
        }
        MediaUploadViewModel $r5 = getMediaUploadViewModel();
        $r5.initialData();
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
        boolean $z0 = $r1.containsKey(KEY_PICKER_OPTION);
        if ($z0) {
            Parcelable $r2 = requireArguments().getParcelable(KEY_PICKER_OPTION);
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
        int $i0 = C0038R.C0041layout.fragment_picture_picker;
        View $r4 = layoutInflater.inflate($i0, viewGroup, false);
        int $i02 = C0038R.C0040id.tv_prompt;
        View $r5 = $r4.findViewById($i02);
        TextView $r6 = (TextView) $r5;
        this.tvPrompt = $r6;
        int $i03 = C0038R.C0040id.fl_camera_view;
        View $r52 = $r4.findViewById($i03);
        FrameLayout $r7 = (FrameLayout) $r52;
        this.flCameraView = $r7;
        int $i04 = C0038R.C0040id.fl_gallery;
        View $r53 = $r4.findViewById($i04);
        FrameLayout $r72 = (FrameLayout) $r53;
        this.flGalleryView = $r72;
        int $i05 = C0038R.C0040id.iv_selected_image;
        View $r54 = $r4.findViewById($i05);
        ImageView $r8 = (ImageView) $r54;
        this.selectedImage = $r8;
        int $i06 = C0038R.C0040id.cl_preview_state;
        View $r55 = $r4.findViewById($i06);
        ConstraintLayout $r9 = (ConstraintLayout) $r55;
        this.previewContainer = $r9;
        int $i07 = C0038R.C0040id.iv_focus_frame;
        View $r56 = $r4.findViewById($i07);
        ImageView $r82 = (ImageView) $r56;
        this.ivFocusFrame = $r82;
        int $i08 = C0038R.C0040id.fl_rotate_camera;
        View $r57 = $r4.findViewById($i08);
        FrameLayout $r73 = (FrameLayout) $r57;
        this.flRotateCamera = $r73;
        int $i09 = C0038R.C0040id.fl_cancel;
        View $r58 = $r4.findViewById($i09);
        FrameLayout $r74 = (FrameLayout) $r58;
        this.flCancel = $r74;
        int $i010 = C0038R.C0040id.cl_camera_state;
        View $r59 = $r4.findViewById($i010);
        ConstraintLayout $r92 = (ConstraintLayout) $r59;
        this.clCameraState = $r92;
        int $i011 = C0038R.C0040id.fl_capture;
        View $r510 = $r4.findViewById($i011);
        FrameLayout $r75 = (FrameLayout) $r510;
        this.flCapture = $r75;
        boolean $z0 = isLollipopAndAbove();
        if ($z0) {
            int $i012 = C0038R.C0040id.camera_view;
            View $r511 = $r4.findViewById($i012);
            AutoFitTextureView $r10 = (AutoFitTextureView) $r511;
            this.cameraView = $r10;
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
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
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC1565i $r1 = this.viewLifecycle;
        if ($r1 != null) {
            $r1.c(this);
        }
        this.viewLifecycle = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
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
        if (i == 9) {
            boolean $z02 = isCameraPermissionGiven();
            if ($z02) {
                initCamera2Api();
                return;
            }
            ImagePickerCallback $r3 = this.callback;
            Log_OC.append($r3);
            $r3.onPermissionDenied("android.permission.CAMERA");
        } else if (i == 24) {
            boolean $z03 = isStoragePermissionGiven();
            if ($z03) {
                showGalleryPicturePicker();
                return;
            }
            ImagePickerCallback $r32 = this.callback;
            Log_OC.append($r32);
            $r32.onPermissionDenied("android.permission.READ_EXTERNAL_STORAGE");
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        MediaUploadViewModel $r3 = getMediaUploadViewModel();
        C11680b $r4 = $r3.getMediaUploadViewData();
        FavoritesArrayAdapter $r5 = null;
        if ($r4 != null) {
            PreferenceActivity $r6 = getViewLifecycleOwner();
            Log_OC.loadImage($r6, "viewLifecycleOwner");
            AbstractC11688p $r7 = C7390a.a($r4, $r6);
            if ($r7 != null) {
                Object object = new Object() { // from class: ai.kudi.agent.v2.common.view.fragment.FlingerListView$ItemFlingerResponder
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        ImagePickerFragment $r1 = ImagePickerFragment.this;
                        MediaUploadViewData $r32 = (MediaUploadViewData) obj;
                        ImagePickerFragment.m41553onViewCreated$lambda1($r1, $r32);
                    }
                };
                Logger $r9 = Logger.log;
                $r5 = $r7.e0(object, $r9);
            }
        }
        this.disposable = $r5;
        init();
    }

    public final void setMediaUploadViewModel(MediaUploadViewModel mediaUploadViewModel) {
        Log_OC.getArray(mediaUploadViewModel, "<set-?>");
        this.mediaUploadViewModel = mediaUploadViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadPictureToMediaService() {
        if (this.selectedImageBitmap == null) {
            return;
        }
        ImagePickerCallback $r2 = this.callback;
        if ($r2 != null) {
            $r2.onUploadStarted();
        }
        toggleCancelBtn$default(this, false, 1, null);
        MediaUploadViewModel $r3 = getMediaUploadViewModel();
        FileProcessor.Companion $r4 = FileProcessor.Companion;
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        Bitmap $r1 = this.selectedImageBitmap;
        Log_OC.append($r1);
        String $r6 = FileProcessor.Companion.getCompressedBitmapFilePathFrom$default($r4, $r5, $r1, 0, null, 12, null);
        Log_OC.append($r6);
        $r3.uploadImage($r6);
    }
}
