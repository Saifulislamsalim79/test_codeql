package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.usecases.RequestFragmentPermissionUseCase;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageScale;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.AddImageViewBinding;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueResolutionBinding;
import ai.kudi.agent.issues.p008ui.ChargeBackQuestionAlert;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModelKt;
import ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.IssueResolutionFragmentView;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputEditText;
import dagger.android.p197e.C7429a;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: IssueResolutionFragment.kt */
@Metadata(m10422d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u0000 Q2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001QB\u0005¢\u0006\u0002\u0010\u0007J\b\u0010!\u001a\u00020\"H\u0016J\u0006\u0010#\u001a\u00020\u000eJ\b\u0010$\u001a\u00020\u0003H\u0016J\u0019\u0010%\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0096\u0001J\"\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u000104H\u0016J$\u00105\u001a\u00020&2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010:\u001a\u00020\"H\u0016J\u0010\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020@H\u0016J-\u0010A\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0C2\u0006\u0010D\u001a\u00020EH\u0016¢\u0006\u0002\u0010FJ\u001a\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010I\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010J\u001a\u00020\"H\u0016J\b\u0010K\u001a\u00020\"H\u0016J\t\u0010L\u001a\u00020\u0006H\u0096\u0001J\b\u0010M\u001a\u00020\"H\u0002J\u0010\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\"H\u0016R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006R"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueResolutionFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/IssueResolutionFragmentView;", "Lai/kudi/agent/issues/presenters/IssueResolutionFragmentPresenter;", "Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$ChargeBackQuestionAlertListener;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueResolutionBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueResolutionBinding;", "currentPhotoPath", "", "firstFile", "Ljava/io/File;", "firstImage", "imageView", "Landroid/widget/ImageView;", "initialLabel", "initialTitle", "issueDataArgs", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "permissionDisposable", "Lio/reactivex/disposables/Disposable;", "secondFile", "secondImage", "thirdFile", "thirdImage", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/issues/presenters/IssueResolutionFragmentPresenter;", "setThisPresenter", "(Lai/kudi/agent/issues/presenters/IssueResolutionFragmentPresenter;)V", "addImagesIfExists", "", "createImageFile", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityResult", "requestCode", "", "resultCode", "imageIntent", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onNoClicked", "dialogFragment", "Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "onYesClicked", "openFromFile", "requestForStoragePermission", "requireBinding", "setUpView", "showErrorMessage", "msg", "showIsChargeBackDialog", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueResolutionFragment */
/* loaded from: classes.dex */
public final class IssueResolutionFragment extends MvpFragment<IssueResolutionFragmentView, IssueResolutionFragmentPresenter> implements IssueResolutionFragmentView, ChargeBackQuestionAlert.ChargeBackQuestionAlertListener, BaseViewBinder<FragmentIssueResolutionBinding> {
    public static final Companion Companion;
    public static final String INITIAL_LABEL = "LABEL";
    public static final String INITIAL_TITLE = "TITLE";
    private static final String ISSUE_DATA = "Issue Data";
    public static final int REQUEST_CODE_OPEN_FILE = 1;
    public static final int REQUEST_CODE_STORAGE_PERMISSION = 2;
    private final /* synthetic */ BaseViewBinderImpl<FragmentIssueResolutionBinding> $$delegate_0;
    private String currentPhotoPath;
    private File firstFile;
    private String firstImage;
    private ImageView imageView;
    private String initialLabel;
    private String initialTitle;
    private IssueTypeModel issueDataArgs;
    private FavoritesArrayAdapter permissionDisposable;
    private File secondFile;
    private String secondImage;
    private File thirdFile;
    private String thirdImage;
    public IssueResolutionFragmentPresenter thisPresenter;

    /* compiled from: IssueResolutionFragment.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueResolutionFragment$Companion;", "", "()V", "INITIAL_LABEL", "", "INITIAL_TITLE", CustomerDetailsIssueFragment.ISSUE_DATA, "REQUEST_CODE_OPEN_FILE", "", "REQUEST_CODE_STORAGE_PERMISSION", "newInstance", "Lai/kudi/agent/issues/ui/IssueResolutionFragment;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "initialLabel", "initialTitle", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueResolutionFragment$Companion */
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
        public final IssueResolutionFragment newInstance(IssueTypeModel issueTypeModel, String str, String str2) {
            Log_OC.getArray(issueTypeModel, "issueData");
            IssueResolutionFragment r7 = new IssueResolutionFragment();
            Bundle r8 = new Bundle();
            r8.putParcelable(IssueResolutionFragment.ISSUE_DATA, issueTypeModel);
            r8.putString(IssueResolutionFragment.INITIAL_LABEL, str);
            r8.putString("TITLE", str2);
            C13666w c13666w = C13666w.f30112a;
            IssueResolutionFragment r9 = r7;
            r9.setArguments(r8);
            return r7;
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
    public IssueResolutionFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.firstImage = "";
        this.secondImage = "";
        this.thirdImage = "";
        File $r2 = new File("");
        this.firstFile = $r2;
        File $r22 = new File("");
        this.secondFile = $r22;
        File $r23 = new File("");
        this.thirdFile = $r23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpView() {
        final FragmentIssueResolutionBinding $r1 = requireBinding();
        IssueTypeModel $r2 = this.issueDataArgs;
        String $r3 = $r2 == null ? null : $r2.getType();
        boolean $z0 = Log_OC.append($r3, IssueDetailsViewModelKt.OTHER_ISSUES_LABEL);
        if ($z0) {
            View $r4 = $r1.skipThisStep;
            Log_OC.loadImage($r4, "skipThisStep");
            View r18 = $r4;
            ViewExtKt.hide$default(r18, false, 1, null);
        }
        AddImageViewBinding $r5 = $r1.addImage1;
        ViewGroup $r6 = $r5.getRoot();
        ViewGroup r19 = $r6;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Settings$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueResolutionFragment $r22 = IssueResolutionFragment.this;
                FragmentIssueResolutionBinding $r32 = $r1;
                IssueResolutionFragment.m39485setUpView$lambda7$lambda1($r22, $r32, view);
            }
        });
        AddImageViewBinding $r52 = $r1.addImage2;
        ViewGroup $r62 = $r52.getRoot();
        ViewGroup r192 = $r62;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.ContactDetails
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueResolutionFragment $r22 = IssueResolutionFragment.this;
                FragmentIssueResolutionBinding $r32 = $r1;
                IssueResolutionFragment.m39486setUpView$lambda7$lambda2($r22, $r32, view);
            }
        });
        AddImageViewBinding $r53 = $r1.addImage3;
        ViewGroup $r63 = $r53.getRoot();
        ViewGroup r193 = $r63;
        r193.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueResolutionFragment $r22 = IssueResolutionFragment.this;
                FragmentIssueResolutionBinding $r32 = $r1;
                IssueResolutionFragment.m39487setUpView$lambda7$lambda3($r22, $r32, view);
            }
        });
        TextView r20 = $r1.skipThisStep;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Stats$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueResolutionFragment $r22 = IssueResolutionFragment.this;
                IssueResolutionFragment.m39488setUpView$lambda7$lambda5($r22, view);
            }
        });
        ViewGroup $r11 = $r1.continueButton;
        ViewGroup r194 = $r11;
        r194.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentIssueResolutionBinding $r22 = FragmentIssueResolutionBinding.this;
                IssueResolutionFragment $r32 = this;
                IssueResolutionFragment.m39489setUpView$lambda7$lambda6($r22, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-7$lambda-1  reason: not valid java name */
    public static final void m39485setUpView$lambda7$lambda1(IssueResolutionFragment issueResolutionFragment, FragmentIssueResolutionBinding fragmentIssueResolutionBinding, View view) {
        Log_OC.getArray(issueResolutionFragment, "this$0");
        Log_OC.getArray(fragmentIssueResolutionBinding, "$this_apply");
        ImageView $r4 = fragmentIssueResolutionBinding.image1;
        issueResolutionFragment.imageView = $r4;
        IssueResolutionFragmentPresenter $r0 = issueResolutionFragment.getThisPresenter();
        $r0.selectPictureFromFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-7$lambda-2  reason: not valid java name */
    public static final void m39486setUpView$lambda7$lambda2(IssueResolutionFragment issueResolutionFragment, FragmentIssueResolutionBinding fragmentIssueResolutionBinding, View view) {
        Log_OC.getArray(issueResolutionFragment, "this$0");
        Log_OC.getArray(fragmentIssueResolutionBinding, "$this_apply");
        ImageView $r4 = fragmentIssueResolutionBinding.image2;
        issueResolutionFragment.imageView = $r4;
        IssueResolutionFragmentPresenter $r0 = issueResolutionFragment.getThisPresenter();
        $r0.selectPictureFromFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-7$lambda-3  reason: not valid java name */
    public static final void m39487setUpView$lambda7$lambda3(IssueResolutionFragment issueResolutionFragment, FragmentIssueResolutionBinding fragmentIssueResolutionBinding, View view) {
        Log_OC.getArray(issueResolutionFragment, "this$0");
        Log_OC.getArray(fragmentIssueResolutionBinding, "$this_apply");
        ImageView $r4 = fragmentIssueResolutionBinding.image3;
        issueResolutionFragment.imageView = $r4;
        IssueResolutionFragmentPresenter $r0 = issueResolutionFragment.getThisPresenter();
        $r0.selectPictureFromFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-7$lambda-5  reason: not valid java name */
    public static final void m39488setUpView$lambda7$lambda5(IssueResolutionFragment issueResolutionFragment, View view) {
        Log_OC.getArray(issueResolutionFragment, "this$0");
        IssueTypeModel $r2 = issueResolutionFragment.issueDataArgs;
        if ($r2 == null) {
            return;
        }
        String $r3 = $r2.getTitle();
        $r2.setDescription($r3);
        ArrayList r8 = new ArrayList();
        $r2.setImgUrls(r8);
        IssueResolutionFragment r10 = issueResolutionFragment;
        FragmentActivity $r5 = r10.getActivity();
        if ($r5 == null) {
            NullPointerException r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r9;
        }
        IssueActivity $r6 = (IssueActivity) $r5;
        $r6.toIssueSummaryFragment($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: setUpView$lambda-7$lambda-6  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39489setUpView$lambda7$lambda6(ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueResolutionBinding r25, ai.kudi.agent.issues.p008ui.IssueResolutionFragment r26, android.view.View r27) {
        /*
            java.lang.String r6 = "$this_apply"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            java.lang.String r6 = "this$0"
            r0 = r26
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            r0 = r25
            com.google.android.material.textfield.TextInputEditText r7 = r0.textInputEditText
            android.text.Editable r8 = r7.getText()
            java.lang.String r9 = java.lang.String.valueOf(r8)
            r0 = r26
            P extends h.d.a.c.d<V> r10 = r0.presenter
            r12 = r10
            ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter r12 = (ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter) r12
            r11 = r12
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            r14 = 0
            if (r13 != 0) goto L2b
            r15 = 0
            goto L2f
        L2b:
            java.lang.String r15 = r13.getLabel()
        L2f:
            ai.kudi.agent.issues.viewmodels.model.IssueLabels r16 = ai.kudi.agent.issues.viewmodels.model.IssueLabels.CHARGE_BACK
            r0 = r16
            java.lang.String r17 = r0.getLabel()
            r0 = r17
            boolean r18 = kotlin.p483e0.p485d.Log_OC.append(r15, r0)
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            if (r13 != 0) goto L45
            r15 = 0
            goto L49
        L45:
            java.lang.String r15 = r13.getType()
        L49:
            java.lang.String r6 = "CASH_WITHDRAWAL"
            boolean r19 = kotlin.p483e0.p485d.Log_OC.append(r15, r6)
            if (r19 != 0) goto L90
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            if (r13 != 0) goto L59
            r15 = 0
            goto L5d
        L59:
            java.lang.String r15 = r13.getType()
        L5d:
            java.lang.String r6 = "POS-WITHDRAWAL"
            boolean r19 = kotlin.p483e0.p485d.Log_OC.append(r15, r6)
            if (r19 != 0) goto L90
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            if (r13 != 0) goto L6d
            r15 = 0
            goto L71
        L6d:
            java.lang.String r15 = r13.getType()
        L71:
            java.lang.String r6 = "USSD-WITHDRAWAL"
            boolean r19 = kotlin.p483e0.p485d.Log_OC.append(r15, r6)
            if (r19 != 0) goto L90
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            if (r13 != 0) goto L80
            goto L84
        L80:
            java.lang.String r14 = r13.getType()
        L84:
            java.lang.String r6 = "CARD-WITHDRAWAL"
            boolean r19 = kotlin.p483e0.p485d.Log_OC.append(r14, r6)
            if (r19 == 0) goto L8d
            goto L90
        L8d:
            r19 = 0
            goto L92
        L90:
            r19 = 1
        L92:
            r0 = r18
            r1 = r19
            boolean r18 = r11.isKeyWordsInDescriptionSuggestingChargeback(r9, r0, r1)
            if (r18 != 0) goto Lce
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            if (r13 != 0) goto La3
            goto La6
        La3:
            r13.setDescription(r9)
        La6:
            r0 = r26
            P extends h.d.a.c.d<V> r10 = r0.presenter
            java.lang.String r6 = "presenter"
            kotlin.p483e0.p485d.Log_OC.loadImage(r10, r6)
            r20 = r10
            ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter r20 = (ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter) r20
            r11 = r20
            r0 = r26
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r13 = r0.issueDataArgs
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r0 = r11
            r1 = r13
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter.attemptToSubmitIssue$default(r0, r1, r2, r3, r4, r5)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.IssueResolutionFragment.m39489setUpView$lambda7$lambda6(ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueResolutionBinding, ai.kudi.agent.issues.ui.IssueResolutionFragment, android.view.View):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueResolutionFragmentView
    public void addImagesIfExists() {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        IssueTypeModel $r1 = this.issueDataArgs;
        if ($r1 == null) {
            return;
        }
        String $r2 = this.firstImage;
        $z0 = C13276s.m5440u($r2);
        if (!$z0) {
            List $r3 = $r1.getImgUrls();
            String $r22 = this.firstImage;
            $r3.add($r22);
        }
        String $r23 = this.secondImage;
        $z02 = C13276s.m5440u($r23);
        if (!$z02) {
            List $r32 = $r1.getImgUrls();
            String $r24 = this.secondImage;
            $r32.add($r24);
        }
        String $r25 = this.thirdImage;
        $z03 = C13276s.m5440u($r25);
        if (!$z03) {
            List $r33 = $r1.getImgUrls();
            String $r26 = this.thirdImage;
            $r33.add($r26);
        }
        List $r34 = $r1.getDefaultUrls();
        $r34.clear();
        File $r4 = this.firstFile;
        boolean $z04 = $r4.exists();
        if ($z04) {
            List $r35 = $r1.getDefaultUrls();
            File $r42 = this.firstFile;
            $r35.add($r42);
        }
        File $r43 = this.secondFile;
        boolean $z05 = $r43.exists();
        if ($z05) {
            List $r36 = $r1.getDefaultUrls();
            File $r44 = this.secondFile;
            $r36.add($r44);
        }
        File $r45 = this.thirdFile;
        boolean $z06 = $r45.exists();
        if ($z06) {
            List $r37 = $r1.getDefaultUrls();
            File $r46 = this.thirdFile;
            $r37.add($r46);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final File createImageFile() throws IOException {
        Locale $r2 = Locale.UK;
        SimpleDateFormat r10 = new SimpleDateFormat("yyyyMMdd_HHmmss", $r2);
        Date r11 = new Date();
        String $r4 = r10.format(r11);
        String $r42 = "KUDI_" + ((Object) $r4) + '_';
        IssueResolutionFragment r13 = this;
        Context $r6 = r13.requireContext();
        String $r7 = Environment.DIRECTORY_PICTURES;
        File $r8 = $r6.getExternalFilesDir($r7);
        File $r9 = $r8;
        if ($r8 == null) {
            IssueResolutionFragment r132 = this;
            Context $r62 = r132.requireContext();
            $r9 = $r62.getFilesDir();
        }
        File $r82 = File.createTempFile($r42, ".jpg", $r9);
        String $r43 = $r82.getAbsolutePath();
        this.currentPhotoPath = $r43;
        Log_OC.loadImage($r82, "image");
        return $r82;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public IssueResolutionFragmentPresenter createPresenter() {
        IssueResolutionFragmentPresenter $r1 = getThisPresenter();
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
    public FragmentIssueResolutionBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentIssueResolutionBinding $r3 = (FragmentIssueResolutionBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentIssueResolutionBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueResolutionFragmentPresenter getThisPresenter() {
        IssueResolutionFragmentPresenter $r1 = this.thisPresenter;
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
    public View initBinding(FragmentIssueResolutionBinding fragmentIssueResolutionBinding, Fragment fragment) {
        Log_OC.getArray(fragmentIssueResolutionBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentIssueResolutionBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentIssueResolutionBinding $r4 = (FragmentIssueResolutionBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IssueResolutionFragment r14 = this;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
                this.currentPhotoPath = null;
            } else if (intent == null) {
            } else {
                ImageScale.Companion $r2 = ImageScale.Companion;
                IssueResolutionFragment r142 = this;
                FragmentActivity $r3 = r142.requireActivity();
                Context $r4 = $r3.getApplicationContext();
                Log_OC.loadImage($r4, "requireActivity().applicationContext");
                String $r5 = $r2.getImageFilePath(intent, $r4);
                String $r6 = $r5;
                if ($r5 == null) {
                    $r6 = "";
                }
                this.currentPhotoPath = $r6;
                ImageView $r7 = this.imageView;
                FragmentIssueResolutionBinding $r8 = requireBinding();
                ImageView $r9 = $r8.image1;
                boolean $z0 = Log_OC.append($r7, $r9);
                if ($z0) {
                    this.firstImage = String.valueOf(this.currentPhotoPath);
                    File $r10 = createImageFile();
                    this.firstFile = $r10;
                    FragmentIssueResolutionBinding $r82 = requireBinding();
                    AddImageViewBinding $r11 = $r82.addImage2;
                    View $r12 = $r11.getRoot();
                    Log_OC.loadImage($r12, "requireBinding().addImage2.root");
                    View r15 = $r12;
                    ViewExtKt.show(r15);
                } else {
                    FragmentIssueResolutionBinding $r83 = requireBinding();
                    ImageView $r92 = $r83.image2;
                    boolean $z02 = Log_OC.append($r7, $r92);
                    if ($z02) {
                        this.secondImage = String.valueOf(this.currentPhotoPath);
                        File $r102 = createImageFile();
                        this.secondFile = $r102;
                        FragmentIssueResolutionBinding $r84 = requireBinding();
                        AddImageViewBinding $r112 = $r84.addImage3;
                        View $r122 = $r112.getRoot();
                        Log_OC.loadImage($r122, "requireBinding().addImage3.root");
                        View r152 = $r122;
                        ViewExtKt.show(r152);
                    } else {
                        FragmentIssueResolutionBinding $r85 = requireBinding();
                        ImageView $r93 = $r85.image3;
                        boolean $z03 = Log_OC.append($r7, $r93);
                        if ($z03) {
                            this.thirdImage = String.valueOf(this.currentPhotoPath);
                            File $r103 = createImageFile();
                            this.thirdFile = $r103;
                        }
                    }
                }
                ImageView $r72 = this.imageView;
                if ($r72 == null) {
                    return;
                }
                Uri $r13 = intent.getData();
                $r72.setImageURI($r13);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        IssueResolutionFragment r2 = this;
        C7429a.m18752b(r2);
        IssueResolutionFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IssueResolutionFragment r5 = this;
        r5.setHasOptionsMenu(true);
        IssueResolutionFragment r52 = this;
        Bundle $r1 = r52.getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(ISSUE_DATA);
        IssueTypeModel $r3 = (IssueTypeModel) $r2;
        this.issueDataArgs = $r3;
        String $r4 = $r1.getString(INITIAL_LABEL);
        this.initialLabel = $r4;
        String $r42 = $r1.getString("TITLE");
        this.initialTitle = $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentIssueResolutionBinding $r4 = FragmentIssueResolutionBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        IssueResolutionFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FavoritesArrayAdapter $r1 = this.permissionDisposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.p008ui.ChargeBackQuestionAlert.ChargeBackQuestionAlertListener
    public void onNoClicked(ChargeBackQuestionAlert chargeBackQuestionAlert) {
        Log_OC.getArray(chargeBackQuestionAlert, "dialogFragment");
        chargeBackQuestionAlert.dismiss();
        IssueTypeModel $r1 = this.issueDataArgs;
        if ($r1 != null) {
            FragmentIssueResolutionBinding $r3 = requireBinding();
            TextInputEditText $r4 = $r3.textInputEditText;
            Editable $r5 = $r4.getText();
            String $r6 = String.valueOf($r5);
            $r1.setDescription($r6);
        }
        InterfaceC9413d $r7 = this.presenter;
        Log_OC.loadImage($r7, "presenter");
        IssueResolutionFragmentPresenter $r8 = (IssueResolutionFragmentPresenter) $r7;
        IssueResolutionFragmentPresenter.attemptToSubmitIssue$default($r8, this.issueDataArgs, false, null, 6, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
        IssueResolutionFragment r3 = this;
        super.onPrepareOptionsMenu(menu);
        int $i0 = C0214R.C0216id.search_menu;
        MenuItem $r1 = menu.findItem($i0);
        $r1.setVisible(false);
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
                    openFromFile();
                    return;
                }
            }
            IssueResolutionFragment r4 = this;
            Context $r1 = r4.getContext();
            if ($r1 == null) {
                return;
            }
            ContextExtKt.toast$default($r1, "We need to access your file storage to continue.", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        IssueResolutionFragment r10 = this;
        FragmentActivity $r3 = r10.getActivity();
        if ($r3 == null) {
            NullPointerException r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r9;
        }
        IssueActivity $r4 = (IssueActivity) $r3;
        $r4.setIconVisibility(false);
        IssueResolutionFragment r102 = this;
        FragmentActivity $r32 = r102.getActivity();
        if ($r32 == null) {
            NullPointerException r92 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r92;
        }
        IssueActivity $r42 = (IssueActivity) $r32;
        AppCompatActivity r11 = (AppCompatActivity) $r42;
        AbstractC0925a $r5 = r11.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0214R.string.issue_resolution;
            IssueResolutionFragment r103 = this;
            String $r6 = r103.getString($i0);
            $r5.mo37631C($r6);
        }
        IssueTypeModel $r7 = this.issueDataArgs;
        if ($r7 != null) {
            String $r62 = this.initialLabel;
            String $r63 = $r62;
            if ($r63 == null) {
                $r63 = "";
            }
            $r7.setLabel($r63);
        }
        IssueTypeModel $r72 = this.issueDataArgs;
        if ($r72 != null) {
            String $r64 = this.initialTitle;
            $r72.setTitle($r64);
        }
        setUpView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.p008ui.ChargeBackQuestionAlert.ChargeBackQuestionAlertListener
    public void onYesClicked(ChargeBackQuestionAlert chargeBackQuestionAlert) {
        Log_OC.getArray(chargeBackQuestionAlert, "dialogFragment");
        IssueTypeModel $r2 = this.issueDataArgs;
        if ($r2 == null) {
            return;
        }
        FragmentIssueResolutionBinding $r3 = requireBinding();
        TextInputEditText $r4 = $r3.textInputEditText;
        Editable $r5 = $r4.getText();
        String $r6 = String.valueOf($r5);
        $r2.setDescription($r6);
        chargeBackQuestionAlert.dismiss();
        InterfaceC9413d $r7 = this.presenter;
        IssueResolutionFragmentPresenter $r8 = (IssueResolutionFragmentPresenter) $r7;
        IssueTypeModel $r22 = this.issueDataArgs;
        int $i0 = C0214R.string.charge_back_issue_text;
        IssueResolutionFragment r9 = this;
        String $r62 = r9.getString($i0);
        $r8.attemptToSubmitIssue($r22, true, $r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueResolutionFragmentView
    public void openFromFile() {
        Uri $r2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intent r6 = new Intent("android.intent.action.PICK", $r2);
        IssueResolutionFragment r7 = this;
        Context $r3 = r7.requireContext();
        PackageManager $r4 = $r3.getPackageManager();
        ComponentName $r5 = r6.resolveActivity($r4);
        if ($r5 != null) {
            IssueResolutionFragment r72 = this;
            r72.startActivityForResult(r6, 1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueResolutionFragmentView
    public void requestForStoragePermission() {
        IssueResolutionFragment r3 = this;
        RequestFragmentPermissionUseCase r2 = new RequestFragmentPermissionUseCase("android.permission.READ_EXTERNAL_STORAGE", 2, r3);
        r2.execute(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentIssueResolutionBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentIssueResolutionBinding $r3 = (FragmentIssueResolutionBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentIssueResolutionBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(IssueResolutionFragmentPresenter issueResolutionFragmentPresenter) {
        Log_OC.getArray(issueResolutionFragmentPresenter, "<set-?>");
        this.thisPresenter = issueResolutionFragmentPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueResolutionFragmentView
    public void showErrorMessage(String str) {
        Log_OC.getArray(str, "msg");
        IssueResolutionFragment r3 = this;
        Context $r2 = r3.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueResolutionFragmentView
    public void showIsChargeBackDialog() {
        ChargeBackQuestionAlert.Companion $r1 = ChargeBackQuestionAlert.Companion;
        ChargeBackQuestionAlert $r2 = $r1.newInstance(this);
        IssueResolutionFragment r6 = this;
        FragmentManager $r3 = r6.getChildFragmentManager();
        String $r5 = ChargeBackQuestionAlert.class.getCanonicalName();
        $r2.show($r3, $r5);
    }
}
