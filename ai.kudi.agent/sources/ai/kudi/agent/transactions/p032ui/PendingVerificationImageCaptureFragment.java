package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentPendingVerificationImageCaptureBinding;
import ai.kudi.agent.picture_picker.domains.models.PicturePickerOption;
import ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment;
import ai.kudi.agent.picture_picker.views.PicturePickerCallback;
import ai.kudi.agent.transactions.data.worker.VerificationSubComponent;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingData;
import ai.kudi.agent.transactions.presenters.PendingVerificationImageCapturePresenter;
import ai.kudi.agent.transactions.views.PendingVerificationImageCaptureView;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p590o.p591a.Timber;
/* compiled from: PendingVerificationImageCaptureFragment.kt */
@Metadata(m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00022\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001=B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u0018\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001eH\u0016J \u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0006\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020\u001eH\u0016J\u001a\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\t\u00107\u001a\u00020\u0006H\u0096\u0001J\u0010\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020*H\u0016J\u0010\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\fH\u0016J\u0010\u0010<\u001a\u00020\u001e2\u0006\u00109\u001a\u00020*H\u0002R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PendingVerificationImageCaptureFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transactions/views/PendingVerificationImageCaptureView;", "Lai/kudi/agent/transactions/presenters/PendingVerificationImageCapturePresenter;", "Lai/kudi/agent/picture_picker/views/PicturePickerCallback;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentPendingVerificationImageCaptureBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentPendingVerificationImageCaptureBinding;", "isPictureTaken", "", "pendingVerificationActivity", "Lai/kudi/agent/transactions/ui/PendingVerificationActivity;", "picturePicker", "Lai/kudi/agent/picture_picker/ui/PicturePickerFragment;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/PendingVerificationImageCapturePresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/PendingVerificationImageCapturePresenter;)V", "verifyPendingData", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingData;", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionDenied", "permission", "", "onPictureCancelled", "onPictureTaken", "isPictureAvailable", "bitmap", "Landroid/graphics/Bitmap;", "onPictureUploadFailure", "onPictureUploadSuccessful", "pictureId", "pictureUrl", "onUploadStarted", "onViewCreated", "view", "requireBinding", "showErrorMsg", "msg", "showLoading", "show", "toastMsg", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationImageCaptureFragment */
/* loaded from: classes.dex */
public final class PendingVerificationImageCaptureFragment extends AbstractC9412c<PendingVerificationImageCaptureView, PendingVerificationImageCapturePresenter> implements PicturePickerCallback, PendingVerificationImageCaptureView, BaseViewBinder<FragmentPendingVerificationImageCaptureBinding> {
    public static final Companion Companion;
    private static final String KEY_VERIFICATION_DATA = "key_verification_data";
    private final /* synthetic */ BaseViewBinderImpl<FragmentPendingVerificationImageCaptureBinding> $$delegate_0;
    private boolean isPictureTaken;
    private PendingVerificationActivity pendingVerificationActivity;
    private PicturePickerFragment picturePicker;
    public PendingVerificationImageCapturePresenter thisPresenter;
    private VerifyPendingData verifyPendingData;

    /* compiled from: PendingVerificationImageCaptureFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PendingVerificationImageCaptureFragment$Companion;", "", "()V", "KEY_VERIFICATION_DATA", "", "newInstance", "Lai/kudi/agent/transactions/ui/PendingVerificationImageCaptureFragment;", "verifyPendingData", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationImageCaptureFragment$Companion */
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
        public final PendingVerificationImageCaptureFragment newInstance(VerifyPendingData verifyPendingData) {
            Log_OC.getArray(verifyPendingData, "verifyPendingData");
            PendingVerificationImageCaptureFragment r5 = new PendingVerificationImageCaptureFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(PendingVerificationImageCaptureFragment.KEY_VERIFICATION_DATA, verifyPendingData);
            C13666w c13666w = C13666w.f30112a;
            PendingVerificationImageCaptureFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
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
    public PendingVerificationImageCaptureFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m41234onViewCreated$lambda1(PendingVerificationImageCaptureFragment pendingVerificationImageCaptureFragment, View view) {
        Log_OC.getArray(pendingVerificationImageCaptureFragment, "this$0");
        boolean $z0 = pendingVerificationImageCaptureFragment.isPictureTaken;
        if (!$z0) {
            PendingVerificationImageCaptureFragment r6 = pendingVerificationImageCaptureFragment;
            Context $r2 = r6.requireContext();
            String $r3 = $r2.getString(C0001R.string.text_take_picture_first);
            Log_OC.loadImage($r3, "requireContext().getString(R.string.text_take_picture_first)");
            pendingVerificationImageCaptureFragment.toastMsg($r3);
            return;
        }
        PicturePickerFragment $r4 = pendingVerificationImageCaptureFragment.picturePicker;
        if ($r4 != null) {
            $r4.uploadPictureToMediaService();
            return;
        }
        Log_OC.LogError("picturePicker");
        NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
        throw r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toastMsg(String str) {
        PendingVerificationImageCaptureFragment r3 = this;
        FragmentActivity $r2 = r3.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public PendingVerificationImageCapturePresenter createPresenter() {
        PendingVerificationImageCapturePresenter $r1 = getThisPresenter();
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
    public FragmentPendingVerificationImageCaptureBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPendingVerificationImageCaptureBinding $r3 = (FragmentPendingVerificationImageCaptureBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPendingVerificationImageCaptureBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PendingVerificationImageCapturePresenter getThisPresenter() {
        PendingVerificationImageCapturePresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPendingVerificationImageCaptureBinding fragmentPendingVerificationImageCaptureBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPendingVerificationImageCaptureBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPendingVerificationImageCaptureBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPendingVerificationImageCaptureBinding $r4 = (FragmentPendingVerificationImageCaptureBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        PendingVerificationImageCaptureFragment r5 = this;
        super.onAttach(context);
        boolean $z0 = context instanceof PendingVerificationActivity;
        if ($z0) {
            this.pendingVerificationActivity = (PendingVerificationActivity) context;
        }
        PendingVerificationActivity $r3 = this.pendingVerificationActivity;
        if ($r3 != null) {
            VerificationSubComponent $r1 = $r3.getPendingSubComponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("pendingVerificationActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPendingVerificationImageCaptureBinding $r4 = FragmentPendingVerificationImageCaptureBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        PendingVerificationImageCaptureFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPermissionDenied(String str) {
        Log_OC.getArray(str, "permission");
        toastMsg("Permission denied");
        PendingVerificationActivity $r2 = this.pendingVerificationActivity;
        if ($r2 != null) {
            Activity r4 = (Activity) $r2;
            r4.finish();
            return;
        }
        Log_OC.LogError("pendingVerificationActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureCancelled() {
        this.isPictureTaken = false;
    }

    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureTaken(boolean z, Bitmap bitmap) {
        Log_OC.getArray(bitmap, "bitmap");
        this.isPictureTaken = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureUploadFailure() {
        VerifyPendingData $r1 = this.verifyPendingData;
        if ($r1 == null) {
            return;
        }
        this.verifyPendingData = VerifyPendingData.copy$default($r1, null, null, "", null, null, null, null, 123, null);
        showLoading(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onPictureUploadSuccessful(String str, Bitmap bitmap, String str2) {
        Log_OC.getArray(str, "pictureId");
        Log_OC.getArray(bitmap, "bitmap");
        Log_OC.getArray(str2, "pictureUrl");
        String $r3 = Log_OC.m10359a("upload successful ", (Object) str);
        Object[] $r4 = new Object[0];
        Timber.wtf($r3, $r4);
        VerifyPendingData $r5 = this.verifyPendingData;
        VerifyPendingData $r52 = $r5 == null ? null : VerifyPendingData.copy$default($r5, null, null, str, null, null, null, null, 123, null);
        this.verifyPendingData = $r52;
        if ($r52 == null) {
            return;
        }
        PendingVerificationImageCapturePresenter $r6 = getThisPresenter();
        $r6.verifyTransaction($r52);
    }

    @Override // ai.kudi.agent.picture_picker.views.PicturePickerCallback
    public void onUploadStarted() {
        showLoading(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        PicturePickerFragment.Companion $r3 = PicturePickerFragment.Companion;
        PicturePickerOption r14 = new PicturePickerOption(null, 0, 0, false, false, false, false, 95, null);
        this.picturePicker = $r3.newInstance(this, r14);
        PendingVerificationImageCaptureFragment r16 = this;
        FragmentManager $r6 = r16.getChildFragmentManager();
        boolean $z0 = $r6.m35998F0();
        if (!$z0) {
            PendingVerificationImageCaptureFragment r162 = this;
            FragmentManager $r62 = r162.getChildFragmentManager();
            AbstractC1449b0 $r7 = $r62.m35924l();
            Fragment $r5 = this.picturePicker;
            if ($r5 == null) {
                Log_OC.LogError("picturePicker");
                NullPointerException r13 = new NullPointerException("Null throw statement replaced by Soot");
                throw r13;
            }
            Fragment r163 = $r5;
            $r7.m35821r(C0001R.C0003id.container, r163);
            $r7.mo35805i();
        }
        PendingVerificationImageCaptureFragment r164 = this;
        Bundle $r2 = r164.getArguments();
        if ($r2 != null) {
            Parcelable $r8 = $r2.getParcelable(KEY_VERIFICATION_DATA);
            VerifyPendingData $r9 = (VerifyPendingData) $r8;
            this.verifyPendingData = $r9;
        }
        FragmentPendingVerificationImageCaptureBinding $r10 = requireBinding();
        ViewGroup $r11 = $r10.btnContinue;
        ViewGroup r17 = $r11;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PendingVerificationImageCaptureFragment $r22 = PendingVerificationImageCaptureFragment.this;
                PendingVerificationImageCaptureFragment.m41234onViewCreated$lambda1($r22, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPendingVerificationImageCaptureBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPendingVerificationImageCaptureBinding $r3 = (FragmentPendingVerificationImageCaptureBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPendingVerificationImageCaptureBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(PendingVerificationImageCapturePresenter pendingVerificationImageCapturePresenter) {
        Log_OC.getArray(pendingVerificationImageCapturePresenter, "<set-?>");
        this.thisPresenter = pendingVerificationImageCapturePresenter;
    }

    @Override // ai.kudi.agent.transactions.views.PendingVerificationImageCaptureView
    public void showErrorMsg(String str) {
        Log_OC.getArray(str, "msg");
        toastMsg(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.PendingVerificationImageCaptureView
    public void showLoading(boolean z) {
        FragmentPendingVerificationImageCaptureBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.btnContinue;
        PendingVerificationImageCaptureFragment r4 = this;
        View $r3 = r4.getView();
        if ($r3 == null) {
            return;
        }
        if (z) {
            $r2.m38032f();
        } else {
            $r2.m38033e();
        }
        boolean $z0 = !z;
        KudiButton r5 = $r2;
        r5.setEnabled($z0);
    }
}
