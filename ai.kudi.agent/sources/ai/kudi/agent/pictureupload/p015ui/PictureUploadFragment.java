package ai.kudi.agent.pictureupload.p015ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ImageViewExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageScale;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.databinding.ViewPictureUploadFragmentBinding;
import ai.kudi.agent.pictureupload.labs.PictureUploadSubComponent;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.register.navigators.ImageSelectorNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.PictureUploadViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.PictureUploadViewData;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0964i;
import androidx.core.content.C1335a;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.DialogC4547a;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PictureUploadFragment.kt */
@Metadata(m10422d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u0000 d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001dB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0003H\u0014J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u000fH\u0002J\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020\u0002H\u0014J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\n\u00104\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0014J\u0014\u00107\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001a\u00108\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\n2\u0006\u00109\u001a\u000203H\u0002J\b\u0010:\u001a\u00020\u000fH\u0002J\"\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u0002032\u0006\u0010=\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020BH\u0016J\u0016\u0010C\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J$\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020\u000fH\u0016J\b\u0010M\u001a\u00020\u000fH\u0002J\b\u0010N\u001a\u00020\u000fH\u0002J\b\u0010O\u001a\u00020\u000fH\u0016J-\u0010P\u001a\u00020\u000f2\u0006\u0010<\u001a\u0002032\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0R2\u0006\u0010S\u001a\u00020TH\u0016¢\u0006\u0002\u0010UJ\b\u0010V\u001a\u00020\u000fH\u0016J\b\u0010W\u001a\u00020\u000fH\u0002J\u001a\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020E2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010Z\u001a\u00020\u000fH\u0016J\b\u0010[\u001a\u00020\u000fH\u0016J\b\u0010\\\u001a\u00020\u000fH\u0002J\b\u0010]\u001a\u00020\u000fH\u0002J\u0012\u0010^\u001a\u00020\u000f2\b\b\u0002\u0010_\u001a\u00020*H\u0002J\u0010\u0010`\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\nH\u0002J\b\u0010a\u001a\u00020\u000fH\u0002J\b\u0010b\u001a\u00020\u000fH\u0002J\b\u0010c\u001a\u0004\u0018\u00010\nR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006e"}, m10421d2 = {"Lai/kudi/agent/pictureupload/ui/PictureUploadFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/ui/viewmodels/PictureUploadViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/PictureUploadViewData;", "Lai/kudi/agent/databinding/ViewPictureUploadFragmentBinding;", "Lai/kudi/agent/register/navigators/ImageSelectorNavigator;", "()V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "buttonContinueText", "", "buttonRetryText", "buttonSubmitText", "callback", "Lkotlin/Function0;", "", "currentPhotoPath", "description", "sharedPreferences", "Landroid/content/SharedPreferences;", "successDescription", KudiPin.KUDI_PIN_TITLE, "uploadPictureImageView", "Landroid/widget/ImageView;", "getUploadPictureImageView", "()Landroid/widget/ImageView;", "setUploadPictureImageView", "(Landroid/widget/ImageView;)V", "uploadPictureTextView", "Landroid/widget/TextView;", "getUploadPictureTextView", "()Landroid/widget/TextView;", "setUploadPictureTextView", "(Landroid/widget/TextView;)V", "vm", "getVm", "()Lai/kudi/agent/register/ui/viewmodels/PictureUploadViewModel;", "setVm", "(Lai/kudi/agent/register/ui/viewmodels/PictureUploadViewModel;)V", "applyViewData", "viewData", "checkUpload", "", "clearSharedPreferenceForImageId", "closeBottomSheet", "createImageFile", "Ljava/io/File;", "createViewModel", "getDrawableFromImageInt", "Landroid/graphics/drawable/Drawable;", "imageId", "", "getImageFromSharedPreference", "getVMType", "Ljava/lang/Class;", "initCallback", "loadImageResource", "defaultImage", "onActionButtonClicked", "onActivityResult", "requestCode", "resultCode", "imageIntent", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onContinueSubscription", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onImageHolderClicked", "onOpenCameraClicked", "onPause", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onTakePictureClicked", "onViewCreated", "view", "openFromCamera", "openFromFile", "reset", "setDefaultProperty", "setProgressBarProperty", "isSuccessful", "setSharedPreferenceForImageId", "setUpProperties", "uploadImage", "uploadedImageId", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pictureupload.ui.PictureUploadFragment */
/* loaded from: classes.dex */
public final class PictureUploadFragment extends BaseMVVMViewBindingFragment<PictureUploadViewModel, PictureUploadViewData, ViewPictureUploadFragmentBinding> implements ImageSelectorNavigator {
    private static final String COMPULSORY_UPLOAD_STATE = "COMPULSORY_UPLOAD_STATE";
    public static final Companion Companion;
    private static final String DEFAULT_IMAGE = "DEFAULT_IMAGE";
    private static final String DESCRIPTION = "DESCRIPTION";
    private static final String DISABLE_PHOTO_UPLOAD = "DISABLE_PHOTO_UPLOAD";
    private static final String EXISTING_IMAGE_ID = "EXISTING_IMAGE_ID";
    private static final String IMAGE_ID = "IMAGE_ID";
    public static final int REQUEST_CODE_CAMERA_PERMISSION = 100;
    public static final int REQUEST_CODE_OPEN_CAMERA = 0;
    public static final int REQUEST_CODE_OPEN_FILE = 1;
    public static final int REQUEST_CODE_STORAGE_PERMISSION = 2;
    private static final String SUCCESS_DESCRIPTION = "SUCCESS_DESC";
    private static final String TITLE = "TITLE";
    private DialogC4547a bottomSheetDialog;
    private InterfaceC11756a<C13666w> callback;
    private String description;
    private SharedPreferences sharedPreferences;
    public PictureUploadViewModel srv;
    private String successDescription;
    private String title;
    public ImageView uploadPictureImageView;
    public TextView uploadPictureTextView;
    private String currentPhotoPath = "";
    private String buttonContinueText = "Continue";
    private String buttonRetryText = "Retry";
    private String buttonSubmitText = "Submit";

    /* compiled from: PictureUploadFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/pictureupload/ui/PictureUploadFragment$Companion;", "", "()V", PictureUploadFragment.COMPULSORY_UPLOAD_STATE, "", PictureUploadFragment.DEFAULT_IMAGE, PictureUploadFragment.DESCRIPTION, PictureUploadFragment.DISABLE_PHOTO_UPLOAD, PictureUploadFragment.EXISTING_IMAGE_ID, PictureUploadFragment.IMAGE_ID, "REQUEST_CODE_CAMERA_PERMISSION", "", "REQUEST_CODE_OPEN_CAMERA", "REQUEST_CODE_OPEN_FILE", "REQUEST_CODE_STORAGE_PERMISSION", "SUCCESS_DESCRIPTION", "TITLE", "newInstance", "Lai/kudi/agent/pictureupload/ui/PictureUploadFragment;", "defaultImage", KudiPin.KUDI_PIN_TITLE, "description", "successDescription", "isUploadCompulsory", "", "existingImageId", "disablePhotoUpload", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pictureupload.ui.PictureUploadFragment$Companion */
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
        public static /* synthetic */ PictureUploadFragment newInstance$default(Companion companion, int $i0, String $r3, String $r0, String $r4, boolean $z0, String $r5, boolean $z1, int i, Object obj) {
            int $i2 = i & 1;
            if ($i2 != 0) {
                $i0 = C0001R.C0002drawable.default_profile_pics;
            }
            int $i22 = i & 2;
            if ($i22 != 0) {
                $r3 = "Profile Photo";
            }
            int $i23 = i & 4;
            if ($i23 != 0) {
                $r0 = "Please upload your Nation ID, Passport or Voters ID";
            }
            int $i24 = i & 8;
            if ($i24 != 0) {
                $r4 = null;
            }
            int $i25 = i & 16;
            if ($i25 != 0) {
                $z0 = true;
            }
            int $i26 = i & 32;
            if ($i26 != 0) {
                $r5 = null;
            }
            int $i1 = i & 64;
            if ($i1 != 0) {
                $z1 = false;
            }
            PictureUploadFragment $r1 = companion.newInstance($i0, $r3, $r0, $r4, $z0, $r5, $z1);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PictureUploadFragment newInstance(int i, String str, String str2, String str3, boolean z, String str4, boolean z2) {
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, "description");
            PictureUploadFragment $r6 = new PictureUploadFragment();
            Bundle $r5 = new Bundle();
            $r5.putInt(PictureUploadFragment.DEFAULT_IMAGE, i);
            $r5.putString("TITLE", str);
            $r5.putString(PictureUploadFragment.DESCRIPTION, str2);
            $r5.putString(PictureUploadFragment.SUCCESS_DESCRIPTION, str3);
            $r5.putBoolean(PictureUploadFragment.COMPULSORY_UPLOAD_STATE, z);
            $r5.putString(PictureUploadFragment.EXISTING_IMAGE_ID, str4);
            $r5.putBoolean(PictureUploadFragment.DISABLE_PHOTO_UPLOAD, z2);
            $r6.setArguments($r5);
            return $r6;
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
    private final boolean checkUpload() {
        Bundle $r1 = requireArguments();
        boolean $z0 = $r1.getBoolean(COMPULSORY_UPLOAD_STATE);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void clearSharedPreferenceForImageId() {
        SharedPreferences $r2 = this.sharedPreferences;
        if ($r2 == null) {
            return;
        }
        SharedPreferences.Editor $r1 = $r2.edit();
        $r1.remove(IMAGE_ID);
        $r1.apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void closeBottomSheet() {
        DialogC0964i $r1 = this.bottomSheetDialog;
        if ($r1 == null) {
            return;
        }
        DialogC0964i r2 = $r1;
        boolean $z0 = r2.isShowing();
        if ($z0) {
            DialogC0964i r3 = $r1;
            r3.dismiss();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Drawable getDrawableFromImageInt(int i) {
        FragmentActivity $r1 = requireActivity();
        Context $r2 = $r1.getApplicationContext();
        Drawable $r3 = C1335a.m36322f($r2, i);
        Log_OC.append($r3);
        Log_OC.loadImage($r3, "getDrawable(requireActivity().applicationContext, imageId)!!");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getImageFromSharedPreference() {
        SharedPreferences $r2 = this.sharedPreferences;
        if ($r2 == null) {
            return null;
        }
        String $r1 = $r2.getString(IMAGE_ID, "");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadImageResource(String str, int i) {
        if (str == null) {
            InterfaceC8209a $r2 = requireBinding();
            ViewPictureUploadFragmentBinding $r3 = (ViewPictureUploadFragmentBinding) $r2;
            $r3.profilePictureImageView.setImageResource(i);
            return;
        }
        InterfaceC8209a $r22 = requireBinding();
        ViewPictureUploadFragmentBinding $r32 = (ViewPictureUploadFragmentBinding) $r22;
        ImageView $r4 = $r32.profilePictureImageView;
        Log_OC.loadImage($r4, "requireBinding().profilePictureImageView");
        FragmentActivity $r5 = requireActivity();
        Context $r6 = $r5.getApplicationContext();
        Log_OC.loadImage($r6, "requireActivity().applicationContext");
        ImageUtil.Companion $r7 = ImageUtil.Companion;
        String $r1 = $r7.getRemotePathImageId(str);
        Drawable $r8 = getDrawableFromImageInt(i);
        Drawable $r9 = getDrawableFromImageInt(i);
        ImageView r10 = $r4;
        ImageViewExtKt.load(r10, $r6, $r1, $r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onActionButtonClicked() {
        boolean $z0;
        InterfaceC8209a $r1 = requireBinding();
        ViewPictureUploadFragmentBinding $r2 = (ViewPictureUploadFragmentBinding) $r1;
        Button $r3 = $r2.actionButton;
        CharSequence $r4 = $r3.getText();
        String $r5 = String.valueOf($r4);
        String $r6 = this.buttonSubmitText;
        boolean $z02 = Log_OC.append($r5, $r6);
        boolean $z1 = true;
        if ($z02) {
            $z0 = true;
        } else {
            String $r62 = this.buttonRetryText;
            $z0 = Log_OC.append($r5, $r62);
        }
        if ($z0) {
            InterfaceC8209a $r12 = requireBinding();
            ViewPictureUploadFragmentBinding $r22 = (ViewPictureUploadFragmentBinding) $r12;
            ProgressBar $r7 = $r22.uploadingProgressBar;
            if ($r7 != null) {
                ViewExtKt.show($r7);
            }
            InterfaceC8209a $r13 = requireBinding();
            ViewPictureUploadFragmentBinding $r23 = (ViewPictureUploadFragmentBinding) $r13;
            TextView $r8 = $r23.uploadProgressTextView;
            if ($r8 != null) {
                ViewExtKt.show($r8);
            }
            uploadImage();
            return;
        }
        boolean $z03 = checkUpload();
        if (!$z03) {
            InterfaceC11756a $r9 = this.callback;
            if ($r9 != null) {
                onContinueSubscription($r9);
                return;
            }
            Log_OC.LogError("callback");
            NullPointerException r11 = new NullPointerException("Null throw statement replaced by Soot");
            throw r11;
        }
        String $r52 = getImageFromSharedPreference();
        if ($r52 != null) {
            int $i0 = $r52.length();
            if ($i0 != 0) {
                $z1 = false;
            }
        }
        if ($z1) {
            FragmentActivity $r10 = getActivity();
            if ($r10 == null) {
                return;
            }
            ContextExtKt.toast$default($r10, "Image upload is required to proceed to the next stage!", 0, 2, (Object) null);
            return;
        }
        InterfaceC11756a $r92 = this.callback;
        if ($r92 != null) {
            onContinueSubscription($r92);
            return;
        }
        Log_OC.LogError("callback");
        NullPointerException r112 = new NullPointerException("Null throw statement replaced by Soot");
        throw r112;
    }

    private final void onContinueSubscription(InterfaceC11756a interfaceC11756a) {
        interfaceC11756a.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onImageHolderClicked() {
        Dialog $r1 = this.bottomSheetDialog;
        if ($r1 == null) {
            return;
        }
        Dialog r2 = $r1;
        r2.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onOpenCameraClicked() {
        BaseViewModel $r1 = getViewModel();
        PictureUploadViewModel $r2 = (PictureUploadViewModel) $r1;
        $r2.selectPictureFromFile();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onTakePictureClicked() {
        BaseViewModel $r1 = getViewModel();
        PictureUploadViewModel $r2 = (PictureUploadViewModel) $r1;
        $r2.selectPictureFromCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-0  reason: not valid java name */
    public static final void m40019onViewCreated$lambda2$lambda0(PictureUploadFragment pictureUploadFragment, View view) {
        Log_OC.getArray(pictureUploadFragment, "this$0");
        pictureUploadFragment.onActionButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40020onViewCreated$lambda2$lambda1(PictureUploadFragment pictureUploadFragment, View view) {
        Log_OC.getArray(pictureUploadFragment, "this$0");
        pictureUploadFragment.reset();
        pictureUploadFragment.onImageHolderClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void reset() {
        InterfaceC8209a $r1 = requireBinding();
        ViewPictureUploadFragmentBinding $r2 = (ViewPictureUploadFragmentBinding) $r1;
        Button $r3 = $r2.actionButton;
        String $r4 = this.buttonContinueText;
        $r3.setText($r4);
        ProgressBar $r5 = $r2.uploadingProgressBar;
        if ($r5 != null) {
            ViewExtKt.hide$default($r5, false, 1, null);
        }
        TextView $r6 = $r2.uploadProgressTextView;
        if ($r6 != null) {
            ViewExtKt.hide$default($r6, false, 1, null);
        }
        setDefaultProperty();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setDefaultProperty() {
        Bundle $r2 = getArguments();
        Log_OC.append($r2);
        String $r1 = $r2.getString("TITLE");
        this.title = $r1;
        FragmentActivity $r3 = getActivity();
        if ($r3 != null) {
            String $r12 = this.title;
            $r3.setTitle($r12);
        }
        String $r13 = $r2.getString(EXISTING_IMAGE_ID);
        int $i0 = $r2.getInt(DEFAULT_IMAGE);
        loadImageResource($r13, $i0);
        String $r14 = $r2.getString(DESCRIPTION);
        String $r4 = $r14;
        if ($r14 == null) {
            $r4 = "";
        }
        this.description = $r4;
        String $r15 = $r2.getString(SUCCESS_DESCRIPTION);
        this.successDescription = $r15;
        InterfaceC8209a $r5 = requireBinding();
        ViewPictureUploadFragmentBinding $r6 = (ViewPictureUploadFragmentBinding) $r5;
        TextView $r7 = $r6.descriptionTextView;
        String $r16 = this.description;
        if ($r16 == null) {
            Log_OC.LogError("description");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        $r7.setText($r16);
        String $r17 = $r2.getString(EXISTING_IMAGE_ID, "");
        Log_OC.loadImage($r17, "getString(EXISTING_IMAGE_ID, \"\")");
        setSharedPreferenceForImageId($r17);
        boolean $z0 = $r2.getBoolean(DISABLE_PHOTO_UPLOAD);
        if ($z0) {
            TextView $r72 = getUploadPictureTextView();
            ViewExtKt.hide$default($r72, false, 1, null);
            ImageView $r8 = getUploadPictureImageView();
            ViewExtKt.hide$default($r8, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setProgressBarProperty(boolean z) {
        int $i0;
        if (z) {
            $i0 = -16711936;
        } else {
            $i0 = -65536;
            InterfaceC8209a $r1 = requireBinding();
            ViewPictureUploadFragmentBinding $r2 = (ViewPictureUploadFragmentBinding) $r1;
            ProgressBar $r3 = $r2.uploadingProgressBar;
            $r3.setProgress(100);
        }
        InterfaceC8209a $r12 = requireBinding();
        ViewPictureUploadFragmentBinding $r22 = (ViewPictureUploadFragmentBinding) $r12;
        ProgressBar $r32 = $r22.uploadingProgressBar;
        Drawable $r4 = $r32.getProgressDrawable();
        PorterDuff.Mode $r5 = PorterDuff.Mode.SRC_IN;
        $r4.setColorFilter($i0, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void setProgressBarProperty$default(PictureUploadFragment pictureUploadFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        pictureUploadFragment.setProgressBarProperty($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setSharedPreferenceForImageId(String str) {
        Context $r2 = requireContext();
        String $r3 = this.title;
        SharedPreferences $r4 = $r2.getSharedPreferences($r3, 0);
        this.sharedPreferences = $r4;
        Log_OC.append($r4);
        SharedPreferences.Editor $r5 = $r4.edit();
        $r5.putString(IMAGE_ID, str);
        $r5.apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpProperties() {
        setProgressBarProperty$default(this, false, 1, null);
        FragmentActivity $r2 = requireActivity();
        this.bottomSheetDialog = new DialogC4547a($r2);
        FragmentActivity $r22 = requireActivity();
        LayoutInflater $r3 = $r22.getLayoutInflater();
        View $r4 = $r3.inflate(C0001R.C0004layout.view_picture_upload, (ViewGroup) null);
        Log_OC.loadImage($r4, "requireActivity().layoutInflater.inflate(R.layout.view_picture_upload, null)");
        DialogC4547a $r1 = this.bottomSheetDialog;
        if ($r1 != null) {
            $r1.setContentView($r4);
        }
        View $r5 = $r4.findViewById(C0001R.C0003id.takePictureTextView);
        Log_OC.loadImage($r5, "sheetView.findViewById(R.id.takePictureTextView)");
        TextView $r6 = (TextView) $r5;
        $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pictureupload.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PictureUploadFragment $r23 = PictureUploadFragment.this;
                PictureUploadFragment.m40021setUpProperties$lambda3($r23, view);
            }
        });
        View $r52 = $r4.findViewById(C0001R.C0003id.uploadPictureTextView);
        Log_OC.loadImage($r52, "sheetView.findViewById(R.id.uploadPictureTextView)");
        TextView $r62 = (TextView) $r52;
        setUploadPictureTextView($r62);
        View $r42 = $r4.findViewById(C0001R.C0003id.uploadPictureImageView);
        Log_OC.loadImage($r42, "sheetView.findViewById(R.id.uploadPictureImageView)");
        setUploadPictureImageView((ImageView) $r42);
        TextView $r63 = getUploadPictureTextView();
        $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pictureupload.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PictureUploadFragment $r23 = PictureUploadFragment.this;
                PictureUploadFragment.m40022setUpProperties$lambda4($r23, view);
            }
        });
        setDefaultProperty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpProperties$lambda-3  reason: not valid java name */
    public static final void m40021setUpProperties$lambda3(PictureUploadFragment pictureUploadFragment, View view) {
        Log_OC.getArray(pictureUploadFragment, "this$0");
        pictureUploadFragment.closeBottomSheet();
        pictureUploadFragment.onTakePictureClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpProperties$lambda-4  reason: not valid java name */
    public static final void m40022setUpProperties$lambda4(PictureUploadFragment pictureUploadFragment, View view) {
        Log_OC.getArray(pictureUploadFragment, "this$0");
        pictureUploadFragment.closeBottomSheet();
        pictureUploadFragment.onOpenCameraClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void uploadImage() {
        BaseViewModel $r1 = getViewModel();
        PictureUploadViewModel $r2 = (PictureUploadViewModel) $r1;
        ImageScale.Companion $r3 = ImageScale.Companion;
        String $r4 = this.currentPhotoPath;
        File $r5 = createImageFile();
        String $r42 = $r3.scaleDownFile($r4, $r5);
        Log_OC.append($r42);
        PictureUploadFragment$uploadImage$1 $r6 = new PictureUploadFragment$uploadImage$1(this);
        $r2.uploadImage($r42, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PictureUploadViewData $r2 = (PictureUploadViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PictureUploadViewData pictureUploadViewData) {
        Log_OC.getArray(pictureUploadViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        ViewPictureUploadFragmentBinding $r3 = (ViewPictureUploadFragmentBinding) $r2;
        TextView $r4 = $r3.uploadProgressTextView;
        if ($r4 != null) {
            StringBuilder $r5 = new StringBuilder();
            int $i0 = pictureUploadViewData.getUploadingProgress();
            $r5.append($i0);
            $r5.append(" %");
            String $r6 = $r5.toString();
            $r4.setText($r6);
        }
        ProgressBar $r7 = $r3.uploadingProgressBar;
        if ($r7 != null) {
            int $i02 = pictureUploadViewData.getUploadingProgress();
            $r7.setProgress($i02);
        }
        boolean $z0 = pictureUploadViewData.isUploadingPicture();
        if ($z0) {
            Button $r8 = $r3.actionButton;
            if ($r8 != null) {
                ViewExtKt.disable($r8);
            }
        } else {
            Button $r82 = $r3.actionButton;
            if ($r82 != null) {
                ViewExtKt.enable($r82);
            }
        }
        PictureUploadViewData.UploadedImageStatus $r9 = pictureUploadViewData.getUploadedImageStatus();
        if ($r9 != null) {
            Button $r83 = $r3.actionButton;
            String $r62 = this.buttonContinueText;
            $r83.setText($r62);
            TextView $r42 = $r3.uploadProgressTextView;
            if ($r42 != null) {
                $r42.setText("100 %");
            }
            TextView $r43 = $r3.descriptionTextView;
            String $r63 = this.successDescription;
            if ($r63 == null) {
                $r63 = getString(C0001R.string.upload_successful);
            }
            $r43.setText($r63);
            PictureUploadViewData.UploadedImageStatus $r92 = pictureUploadViewData.getUploadedImageStatus();
            String $r64 = $r92.getUploadedImageId();
            setSharedPreferenceForImageId($r64);
        }
        PictureUploadViewData.Error $r10 = pictureUploadViewData.getError();
        if ($r10 == null) {
            return;
        }
        $r3.uploadProgressTextView.setText("0%");
        Button $r84 = $r3.actionButton;
        String $r65 = this.buttonRetryText;
        $r84.setText($r65);
        TextView $r44 = $r3.descriptionTextView;
        String $r66 = getString(C0001R.string.upload_failed);
        $r44.setText($r66);
        setProgressBarProperty(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final File createImageFile() throws IOException {
        Locale $r2 = Locale.UK;
        SimpleDateFormat $r1 = new SimpleDateFormat("yyyyMMdd_HHmmss", $r2);
        Date $r3 = new Date();
        String $r4 = $r1.format($r3);
        String $r42 = "KUDI_" + ((Object) $r4) + '_';
        Context $r6 = requireContext();
        String $r7 = Environment.DIRECTORY_PICTURES;
        File $r8 = $r6.getExternalFilesDir($r7);
        File $r9 = $r8;
        if ($r8 == null) {
            Context $r62 = requireContext();
            $r9 = $r62.getFilesDir();
        }
        File $r82 = File.createTempFile($r42, ".jpg", $r9);
        String $r43 = $r82.getAbsolutePath();
        Log_OC.loadImage($r43, "image.absolutePath");
        this.currentPhotoPath = $r43;
        Log_OC.loadImage($r82, "image");
        return $r82;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PictureUploadViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PictureUploadViewModel createViewModel() {
        PictureUploadViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ImageView getUploadPictureImageView() {
        ImageView $r1 = this.uploadPictureImageView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("uploadPictureImageView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TextView getUploadPictureTextView() {
        TextView $r1 = this.uploadPictureTextView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("uploadPictureTextView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PictureUploadViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PictureUploadViewModel getVm() {
        PictureUploadViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    public final void initCallback(InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11756a, "callback");
        this.callback = interfaceC11756a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC8209a $r2 = requireBinding();
        ViewPictureUploadFragmentBinding $r3 = (ViewPictureUploadFragmentBinding) $r2;
        if (i == 0) {
            if (i2 != -1) {
                this.currentPhotoPath = "";
                Button $r10 = $r3.actionButton;
                String $r4 = this.buttonContinueText;
                $r10.setText($r4);
                return;
            }
            ImageScale.Companion $r5 = ImageScale.Companion;
            ImageView $r9 = $r3.profilePictureImageView;
            Log_OC.loadImage($r9, "profilePictureImageView");
            String $r42 = this.currentPhotoPath;
            ImageView r11 = $r9;
            ImageScale.Companion.setPicture$default($r5, r11, $r42, 0, 4, null);
            Button $r102 = $r3.actionButton;
            String $r43 = this.buttonSubmitText;
            $r102.setText($r43);
        } else if (i != 1) {
        } else {
            if (i2 != -1) {
                this.currentPhotoPath = "";
                Button $r103 = $r3.actionButton;
                String $r44 = this.buttonContinueText;
                $r103.setText($r44);
            } else if (intent == null) {
            } else {
                ImageScale.Companion $r52 = ImageScale.Companion;
                FragmentActivity $r6 = requireActivity();
                Context $r7 = $r6.getApplicationContext();
                Log_OC.loadImage($r7, "requireActivity().applicationContext");
                String $r8 = $r52.getImageFilePath(intent, $r7);
                String $r45 = $r8 != null ? $r8 : "";
                this.currentPhotoPath = $r45;
                ImageScale.Companion $r53 = ImageScale.Companion;
                ImageView $r92 = $r3.profilePictureImageView;
                Log_OC.loadImage($r92, "profilePictureImageView");
                String $r46 = this.currentPhotoPath;
                ImageView r112 = $r92;
                ImageScale.Companion.setPicture$default($r53, r112, $r46, 0, 4, null);
                Button $r104 = $r3.actionButton;
                String $r47 = this.buttonSubmitText;
                $r104.setText($r47);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        BaseApplication.Companion $r2 = BaseApplication.Companion;
        BaseApplication $r3 = $r2.getApplication();
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        PictureUploadSubComponent.Factory $r5 = $r4.pictureUploadSubComponent();
        PictureUploadSubComponent $r6 = $r5.create(this);
        $r6.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        ViewPictureUploadFragmentBinding $r4 = ViewPictureUploadFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        closeBottomSheet();
        clearSharedPreferenceForImageId();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        closeBottomSheet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 2) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    BaseViewModel $r3 = getViewModel();
                    PictureUploadViewModel $r4 = (PictureUploadViewModel) $r3;
                    $r4.selectPictureFromFile();
                    return;
                }
            }
            Context $r5 = getContext();
            if ($r5 == null) {
                return;
            }
            ContextExtKt.toast$default($r5, "We need to access your file storage to continue.", 0, 2, (Object) null);
        } else if (i != 100) {
        } else {
            int $i03 = iArr.length;
            boolean $z02 = $i03 == 0;
            if (!$z02) {
                int $i04 = iArr[0];
                if ($i04 == 0) {
                    BaseViewModel $r32 = getViewModel();
                    PictureUploadViewModel $r42 = (PictureUploadViewModel) $r32;
                    $r42.selectPictureFromCamera();
                    return;
                }
            }
            Context $r52 = getContext();
            if ($r52 == null) {
                return;
            }
            ContextExtKt.toast$default($r52, "We need to access your camera to continue.", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            return;
        }
        String $r1 = this.title;
        $r2.setTitle($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        setUpProperties();
        InterfaceC8209a $r4 = requireBinding();
        ViewPictureUploadFragmentBinding $r5 = (ViewPictureUploadFragmentBinding) $r4;
        Button $r6 = $r5.actionButton;
        if ($r6 != null) {
            $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pictureupload.ui.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PictureUploadFragment $r2 = PictureUploadFragment.this;
                    PictureUploadFragment.m40019onViewCreated$lambda2$lambda0($r2, view2);
                }
            });
        }
        ImageView $r7 = $r5.profilePictureImageView;
        ImageView r12 = $r7;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pictureupload.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PictureUploadFragment $r2 = PictureUploadFragment.this;
                PictureUploadFragment.m40020onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
        PictureUploadViewModel $r9 = getVm();
        $r9.setFragment(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.ImageSelectorNavigator
    public void openFromCamera() {
        File $r5;
        Intent $r1 = new Intent("android.media.action.IMAGE_CAPTURE");
        Context $r2 = requireContext();
        PackageManager $r3 = $r2.getPackageManager();
        ComponentName $r4 = $r1.resolveActivity($r3);
        if ($r4 != null) {
            try {
                $r5 = createImageFile();
            } catch (IOException $r6) {
                CrashlyticsReport.logException($r6);
                $r6.printStackTrace();
                $r5 = null;
            }
            if ($r5 != null) {
                Context $r22 = requireContext();
                Uri $r7 = FileProvider.getUriForFile($r22, "ai.kudi.agent.android.fileprovider", $r5);
                $r1.putExtra("output", $r7);
                startActivityForResult($r1, 0);
                return;
            }
            FragmentActivity $r8 = getActivity();
            if ($r8 == null) {
                return;
            }
            ContextExtKt.toast$default($r8, "An error occurred opening Camera. ", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.ImageSelectorNavigator
    public void openFromFile() {
        Uri $r2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intent $r1 = new Intent("android.intent.action.PICK", $r2);
        Context $r3 = requireContext();
        PackageManager $r4 = $r3.getPackageManager();
        ComponentName $r5 = $r1.resolveActivity($r4);
        if ($r5 != null) {
            startActivityForResult($r1, 1);
        }
    }

    public final void setUploadPictureImageView(ImageView imageView) {
        Log_OC.getArray(imageView, "<set-?>");
        this.uploadPictureImageView = imageView;
    }

    public final void setUploadPictureTextView(TextView textView) {
        Log_OC.getArray(textView, "<set-?>");
        this.uploadPictureTextView = textView;
    }

    public final void setVm(PictureUploadViewModel pictureUploadViewModel) {
        Log_OC.getArray(pictureUploadViewModel, "<set-?>");
        this.srv = pictureUploadViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String uploadedImageId() {
        String $r1 = getImageFromSharedPreference();
        return $r1;
    }
}
