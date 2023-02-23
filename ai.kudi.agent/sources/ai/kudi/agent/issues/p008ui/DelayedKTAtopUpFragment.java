package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.usecases.RequestFragmentPermissionUseCase;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageScale;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.AddImageViewBinding;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentDelayedKtatopUpBinding;
import ai.kudi.agent.issues.p008ui.viewModels.DelayedKTAViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.DelayedKTAViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
/* compiled from: DelayedKTAtopUpFragment.kt */
@Metadata(m10422d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 M2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017H\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0003H\u0014J\u0006\u0010$\u001a\u00020\u000eJ\b\u0010%\u001a\u00020\u0002H\u0014J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020'H\u0014J\"\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0016J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020<H\u0016J-\u0010=\u001a\u00020 2\u0006\u0010)\u001a\u00020*2\u000e\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070?2\u0006\u0010@\u001a\u00020AH\u0016¢\u0006\u0002\u0010BJ\u001a\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u0002052\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010E\u001a\u00020 H\u0002J\u0010\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020 H\u0002J\b\u0010J\u001a\u00020 H\u0002J\b\u0010K\u001a\u00020 H\u0002J\b\u0010L\u001a\u00020 H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, m10421d2 = {"Lai/kudi/agent/issues/ui/DelayedKTAtopUpFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/DelayedKTAViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/DelayedKTAViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentDelayedKtatopUpBinding;", "()V", "currentPhotoPath", "", "delayedKTAViewModel", "getDelayedKTAViewModel", "()Lai/kudi/agent/issues/ui/viewModels/DelayedKTAViewModel;", "setDelayedKTAViewModel", "(Lai/kudi/agent/issues/ui/viewModels/DelayedKTAViewModel;)V", "firstFile", "Ljava/io/File;", "firstImage", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "nipOrNeft", "secondFile", "secondImage", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "thirdFile", "thirdImage", "addImagesIfExists", "", "issueDataArgs", "applyViewData", "viewData", "createImageFile", "createViewModel", "getVMType", "Ljava/lang/Class;", "onActivityResult", "requestCode", "", "resultCode", "imageIntent", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "openFromFile", "openPicture", "it", "", "requestForStoragePermission", "setUpViews", "showBanksView", "showDatePicker", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.DelayedKTAtopUpFragment */
/* loaded from: classes.dex */
public final class DelayedKTAtopUpFragment extends BaseMVVMViewBindingFragment<DelayedKTAViewModel, DelayedKTAViewData, FragmentDelayedKtatopUpBinding> {
    public static final Companion Companion;
    public static final String ISSUE = "ISSUE";
    public static final int STORAGE_PARMISSION_REQUEST_CODE = 0;
    private String currentPhotoPath;
    public DelayedKTAViewModel delayedKTAViewModel;
    private File firstFile;
    public ImageView imageView;
    private IssueTypeModel issueData;
    private File secondFile;
    private Bank selectedBank;
    private File thirdFile;
    private String nipOrNeft = "";
    private String firstImage = "";
    private String secondImage = "";
    private String thirdImage = "";

    /* compiled from: DelayedKTAtopUpFragment.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/issues/ui/DelayedKTAtopUpFragment$Companion;", "", "()V", DelayedKTAtopUpFragment.ISSUE, "", "STORAGE_PARMISSION_REQUEST_CODE", "", "newInstance", "Lai/kudi/agent/issues/ui/DelayedKTAtopUpFragment;", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.DelayedKTAtopUpFragment$Companion */
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
        public final DelayedKTAtopUpFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueTypeModel");
            DelayedKTAtopUpFragment $r3 = new DelayedKTAtopUpFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(DelayedKTAtopUpFragment.ISSUE, issueTypeModel);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
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
    public DelayedKTAtopUpFragment() {
        File $r1 = new File("");
        this.firstFile = $r1;
        File $r12 = new File("");
        this.secondFile = $r12;
        File $r13 = new File("");
        this.thirdFile = $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void addImagesIfExists(IssueTypeModel issueTypeModel) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        String $r2 = this.firstImage;
        $z0 = C13276s.m5440u($r2);
        if (!$z0) {
            List $r3 = issueTypeModel.getImgUrls();
            String $r22 = this.firstImage;
            $r3.add($r22);
        }
        String $r23 = this.secondImage;
        $z02 = C13276s.m5440u($r23);
        if (!$z02) {
            List $r32 = issueTypeModel.getImgUrls();
            String $r24 = this.secondImage;
            $r32.add($r24);
        }
        String $r25 = this.thirdImage;
        $z03 = C13276s.m5440u($r25);
        if (!$z03) {
            List $r33 = issueTypeModel.getImgUrls();
            String $r26 = this.thirdImage;
            $r33.add($r26);
        }
        List $r34 = issueTypeModel.getDefaultUrls();
        $r34.clear();
        File $r4 = this.firstFile;
        boolean $z04 = $r4.exists();
        if ($z04) {
            List $r35 = issueTypeModel.getDefaultUrls();
            File $r42 = this.firstFile;
            $r35.add($r42);
        }
        File $r43 = this.secondFile;
        boolean $z05 = $r43.exists();
        if ($z05) {
            List $r36 = issueTypeModel.getDefaultUrls();
            File $r44 = this.secondFile;
            $r36.add($r44);
        }
        File $r45 = this.thirdFile;
        boolean $z06 = $r45.exists();
        if ($z06) {
            List $r37 = issueTypeModel.getDefaultUrls();
            File $r46 = this.thirdFile;
            $r37.add($r46);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m38842b(FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, DelayedKTAtopUpFragment delayedKTAtopUpFragment, View view) {
        m39472setUpViews$lambda15$lambda14(fragmentDelayedKtatopUpBinding, delayedKTAtopUpFragment, view);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openFromFile() {
        Uri $r2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intent $r1 = new Intent("android.intent.action.PICK", $r2);
        Context $r3 = requireContext();
        PackageManager $r4 = $r3.getPackageManager();
        ComponentName $r5 = $r1.resolveActivity($r4);
        if ($r5 != null) {
            startActivityForResult($r1, 0);
        }
    }

    public final void openPicture(boolean z) {
        if (z) {
            openFromFile();
        } else {
            requestForStoragePermission();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestForStoragePermission() {
        RequestFragmentPermissionUseCase $r1 = new RequestFragmentPermissionUseCase("android.permission.READ_EXTERNAL_STORAGE", 0, this);
        $r1.execute(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpViews() {
        InterfaceC8209a $r1 = requireBinding();
        final FragmentDelayedKtatopUpBinding $r2 = (FragmentDelayedKtatopUpBinding) $r1;
        IssueTypeModel $r3 = this.issueData;
        Log_OC.append($r3);
        boolean $z0 = $r3.isFromTransactionPage();
        if ($z0) {
            KudiInputField $r4 = $r2.transactionDateView;
            IssueTypeModel $r32 = this.issueData;
            Log_OC.append($r32);
            String $r5 = $r32.getTransactionDate();
            $r4.setText($r5);
            KudiInputField $r42 = $r2.amountView;
            IssueTypeModel $r33 = this.issueData;
            Log_OC.append($r33);
            String $r52 = $r33.getTransactionValue();
            $r42.setText($r52);
        }
        KudiInputField $r43 = $r2.sendersBankView;
        EditText $r6 = $r43.getEditText();
        $r6.setFocusable(false);
        $r6.setClickable(true);
        $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.RecordingActivity
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                DelayedKTAtopUpFragment.m39473setUpViews$lambda15$lambda2$lambda1($r22, view);
            }
        });
        ViewGroup $r44 = $r2.sendersBankView;
        ViewGroup r31 = $r44;
        r31.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.AccountActivity$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                DelayedKTAtopUpFragment.m39474setUpViews$lambda15$lambda3($r22, view);
            }
        });
        KudiInputField $r45 = $r2.transactionDateView;
        KudiInputField r312 = $r45;
        r312.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                DelayedKTAtopUpFragment.m39475setUpViews$lambda15$lambda7$lambda4($r22, view);
            }
        });
        EditText $r62 = $r45.getEditText();
        $r62.setFocusable(false);
        $r62.setClickable(true);
        $r62.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.MainSettingsActivity
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                DelayedKTAtopUpFragment.m39476setUpViews$lambda15$lambda7$lambda6$lambda5($r22, view);
            }
        });
        RadioButton $r11 = $r2.radioNIP;
        RadioButton r32 = $r11;
        r32.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                FragmentDelayedKtatopUpBinding $r34 = $r2;
                DelayedKTAtopUpFragment.m39477setUpViews$lambda15$lambda8($r22, $r34, view);
            }
        });
        RadioButton $r112 = $r2.radioNEFT;
        RadioButton r322 = $r112;
        r322.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                FragmentDelayedKtatopUpBinding $r34 = $r2;
                DelayedKTAtopUpFragment.m39478setUpViews$lambda15$lambda9($r22, $r34, view);
            }
        });
        AddImageViewBinding $r14 = $r2.include3;
        ViewGroup $r15 = $r14.getRoot();
        ViewGroup r313 = $r15;
        r313.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                FragmentDelayedKtatopUpBinding $r34 = $r2;
                DelayedKTAtopUpFragment.m39469setUpViews$lambda15$lambda10($r22, $r34, view);
            }
        });
        AddImageViewBinding $r142 = $r2.include4;
        ViewGroup $r152 = $r142.getRoot();
        ViewGroup r314 = $r152;
        r314.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                FragmentDelayedKtatopUpBinding $r34 = $r2;
                DelayedKTAtopUpFragment.m39470setUpViews$lambda15$lambda11($r22, $r34, view);
            }
        });
        AddImageViewBinding $r143 = $r2.include5;
        ViewGroup $r153 = $r143.getRoot();
        ViewGroup r315 = $r153;
        r315.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedKTAtopUpFragment $r22 = DelayedKTAtopUpFragment.this;
                FragmentDelayedKtatopUpBinding $r34 = $r2;
                DelayedKTAtopUpFragment.m39471setUpViews$lambda15$lambda12($r22, $r34, view);
            }
        });
        ViewGroup $r19 = $r2.submitButton;
        ViewGroup r316 = $r19;
        r316.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.SettingsActivity
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentDelayedKtatopUpBinding $r22 = FragmentDelayedKtatopUpBinding.this;
                DelayedKTAtopUpFragment $r34 = this;
                DelayedKTAtopUpFragment.m38842b($r22, $r34, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-15$lambda-10 */
    public static final void m39469setUpViews$lambda15$lambda10(DelayedKTAtopUpFragment delayedKTAtopUpFragment, FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        Log_OC.getArray(fragmentDelayedKtatopUpBinding, "$this_apply");
        ImageView $r4 = fragmentDelayedKtatopUpBinding.image1;
        Log_OC.loadImage($r4, "image1");
        delayedKTAtopUpFragment.setImageView($r4);
        DelayedKTAViewModel $r1 = delayedKTAtopUpFragment.getDelayedKTAViewModel();
        DelayedKTAtopUpFragment$setUpViews$1$6$1 $r5 = new DelayedKTAtopUpFragment$setUpViews$1$6$1(delayedKTAtopUpFragment);
        $r1.selectPictureFromFile($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-15$lambda-11 */
    public static final void m39470setUpViews$lambda15$lambda11(DelayedKTAtopUpFragment delayedKTAtopUpFragment, FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        Log_OC.getArray(fragmentDelayedKtatopUpBinding, "$this_apply");
        ImageView $r4 = fragmentDelayedKtatopUpBinding.image2;
        Log_OC.loadImage($r4, "image2");
        delayedKTAtopUpFragment.setImageView($r4);
        DelayedKTAViewModel $r1 = delayedKTAtopUpFragment.getDelayedKTAViewModel();
        DelayedKTAtopUpFragment$setUpViews$1$7$1 $r5 = new DelayedKTAtopUpFragment$setUpViews$1$7$1(delayedKTAtopUpFragment);
        $r1.selectPictureFromFile($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-15$lambda-12 */
    public static final void m39471setUpViews$lambda15$lambda12(DelayedKTAtopUpFragment delayedKTAtopUpFragment, FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        Log_OC.getArray(fragmentDelayedKtatopUpBinding, "$this_apply");
        ImageView $r4 = fragmentDelayedKtatopUpBinding.image3;
        Log_OC.loadImage($r4, "image3");
        delayedKTAtopUpFragment.setImageView($r4);
        DelayedKTAViewModel $r1 = delayedKTAtopUpFragment.getDelayedKTAViewModel();
        DelayedKTAtopUpFragment$setUpViews$1$8$1 $r5 = new DelayedKTAtopUpFragment$setUpViews$1$8$1(delayedKTAtopUpFragment);
        $r1.selectPictureFromFile($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-15$lambda-14 */
    public static final void m39472setUpViews$lambda15$lambda14(FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, DelayedKTAtopUpFragment delayedKTAtopUpFragment, View view) {
        Log_OC.getArray(fragmentDelayedKtatopUpBinding, "$this_apply");
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        KudiInputField $r4 = fragmentDelayedKtatopUpBinding.depositorsNameView;
        String $r5 = $r4.getText();
        KudiInputField $r42 = fragmentDelayedKtatopUpBinding.sendersBankView;
        String $r6 = $r42.getText();
        KudiInputField $r43 = fragmentDelayedKtatopUpBinding.amountView;
        String $r7 = $r43.getText();
        KudiInputField $r44 = fragmentDelayedKtatopUpBinding.transactionDateView;
        String $r8 = $r44.getText();
        String $r0 = delayedKTAtopUpFragment.nipOrNeft;
        DelayedKTAViewModel $r9 = delayedKTAtopUpFragment.getDelayedKTAViewModel();
        boolean $z0 = $r9.isInputParamsValid($r5, $r6, $r7, $r8, $r0);
        if ($z0) {
            IssueTypeModel $r10 = delayedKTAtopUpFragment.issueData;
            Log_OC.append($r10);
            $r10.setTransactionDate($r8);
            $r10.setTransactionValue($r7);
            String $r02 = delayedKTAtopUpFragment.nipOrNeft;
            $r10.setTransferRoute($r02);
            $r10.setSendersName($r5);
            $r10.setSendersBank($r6);
            $r10.setDescription($r10.getTitle());
            IssueTypeModel $r102 = delayedKTAtopUpFragment.issueData;
            Log_OC.append($r102);
            delayedKTAtopUpFragment.addImagesIfExists($r102);
            DelayedKTAViewModel $r92 = delayedKTAtopUpFragment.getDelayedKTAViewModel();
            IssueTypeModel $r103 = delayedKTAtopUpFragment.issueData;
            Log_OC.append($r103);
            $r92.navigateToSummaryView($r103);
        }
    }

    /* renamed from: setUpViews$lambda-15$lambda-2$lambda-1 */
    public static final void m39473setUpViews$lambda15$lambda2$lambda1(DelayedKTAtopUpFragment delayedKTAtopUpFragment, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        delayedKTAtopUpFragment.showBanksView();
    }

    /* renamed from: setUpViews$lambda-15$lambda-3 */
    public static final void m39474setUpViews$lambda15$lambda3(DelayedKTAtopUpFragment delayedKTAtopUpFragment, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        delayedKTAtopUpFragment.showBanksView();
    }

    /* renamed from: setUpViews$lambda-15$lambda-7$lambda-4 */
    public static final void m39475setUpViews$lambda15$lambda7$lambda4(DelayedKTAtopUpFragment delayedKTAtopUpFragment, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        delayedKTAtopUpFragment.showDatePicker();
    }

    /* renamed from: setUpViews$lambda-15$lambda-7$lambda-6$lambda-5 */
    public static final void m39476setUpViews$lambda15$lambda7$lambda6$lambda5(DelayedKTAtopUpFragment delayedKTAtopUpFragment, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        delayedKTAtopUpFragment.showDatePicker();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-15$lambda-8 */
    public static final void m39477setUpViews$lambda15$lambda8(DelayedKTAtopUpFragment delayedKTAtopUpFragment, FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        Log_OC.getArray(fragmentDelayedKtatopUpBinding, "$this_apply");
        RadioButton $r3 = fragmentDelayedKtatopUpBinding.radioNIP;
        RadioButton r6 = $r3;
        CharSequence $r4 = r6.getText();
        String $r5 = $r4.toString();
        delayedKTAtopUpFragment.nipOrNeft = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-15$lambda-9 */
    public static final void m39478setUpViews$lambda15$lambda9(DelayedKTAtopUpFragment delayedKTAtopUpFragment, FragmentDelayedKtatopUpBinding fragmentDelayedKtatopUpBinding, View view) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        Log_OC.getArray(fragmentDelayedKtatopUpBinding, "$this_apply");
        RadioButton $r3 = fragmentDelayedKtatopUpBinding.radioNEFT;
        RadioButton r6 = $r3;
        CharSequence $r4 = r6.getText();
        String $r5 = $r4.toString();
        delayedKTAtopUpFragment.nipOrNeft = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showBanksView() {
        BanksFragment.Companion $r1 = BanksFragment.Companion;
        Bank $r2 = this.selectedBank;
        String $r3 = $r2 == null ? null : $r2.getBankCode();
        BanksFragment $r4 = $r1.newInstance($r3);
        DelayedKTAtopUpFragment$showBanksView$1 $r5 = new DelayedKTAtopUpFragment$showBanksView$1($r4, this);
        $r4.setOnBankSelectedListener($r5);
        FragmentManager $r6 = getChildFragmentManager();
        String $r32 = BanksFragment.class.getCanonicalName();
        $r4.show($r6, $r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showDatePicker() {
        ContextExtKt.hideKeyboard(this);
        DatePickerFragment.Companion $r1 = DatePickerFragment.Companion;
        DatePickerFragment $r2 = DatePickerFragment.Companion.newInstance$default($r1, true, null, false, 6, null);
        FragmentManager $r3 = getChildFragmentManager();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        $r3.p1(DatePickerFragment.DATE_SET_KEY, $r4, new InterfaceC1523w() { // from class: ai.kudi.agent.issues.ui.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38833c(String str, Bundle bundle) {
                DelayedKTAtopUpFragment $r32 = DelayedKTAtopUpFragment.this;
                DelayedKTAtopUpFragment.m39479showDatePicker$lambda18($r32, str, bundle);
            }
        });
        boolean $z0 = $r2.isAdded();
        if ($z0) {
            return;
        }
        FragmentManager $r32 = getChildFragmentManager();
        $r2.show($r32, DatePickerFragment.year);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showDatePicker$lambda-18 */
    public static final void m39479showDatePicker$lambda18(DelayedKTAtopUpFragment delayedKTAtopUpFragment, String str, Bundle bundle) {
        Log_OC.getArray(delayedKTAtopUpFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r8;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.convertDateToGivenFormat$default($r4, null, 2, null);
            InterfaceC8209a $r5 = delayedKTAtopUpFragment.requireBinding();
            FragmentDelayedKtatopUpBinding $r6 = (FragmentDelayedKtatopUpBinding) $r5;
            KudiInputField $r7 = $r6.transactionDateView;
            $r7.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        DelayedKTAViewData $r2 = (DelayedKTAViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(DelayedKTAViewData delayedKTAViewData) {
        Log_OC.getArray(delayedKTAViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentDelayedKtatopUpBinding $r3 = (FragmentDelayedKtatopUpBinding) $r2;
        DelayedKTAViewData.Error $r4 = delayedKTAViewData.getError();
        if ($r4 == null) {
            return;
        }
        String $r5 = $r4.getDepositorsName();
        KudiInputField $r6 = $r3.depositorsNameView;
        $r6.setError($r5);
        String $r52 = $r4.getBank();
        KudiInputField $r62 = $r3.sendersBankView;
        $r62.setError($r52);
        String $r53 = $r4.getAmount();
        KudiInputField $r63 = $r3.amountView;
        $r63.setError($r53);
        String $r54 = $r4.getDate();
        KudiInputField $r64 = $r3.transactionDateView;
        $r64.setError($r54);
        String $r55 = $r4.getNipOrNeft();
        FragmentActivity $r7 = getActivity();
        if ($r7 == null) {
            return;
        }
        ContextExtKt.toast$default($r7, $r55, 0, 2, (Object) null);
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
        this.currentPhotoPath = $r43;
        Log_OC.loadImage($r82, "image");
        return $r82;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        DelayedKTAViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public DelayedKTAViewModel createViewModel() {
        DelayedKTAViewModel $r1 = getDelayedKTAViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DelayedKTAViewModel getDelayedKTAViewModel() {
        DelayedKTAViewModel $r1 = this.delayedKTAViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("delayedKTAViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ImageView getImageView() {
        ImageView $r1 = this.imageView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("imageView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return DelayedKTAViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC8209a $r2 = requireBinding();
        FragmentDelayedKtatopUpBinding $r3 = (FragmentDelayedKtatopUpBinding) $r2;
        if (i == 0) {
            if (i2 != -1) {
                this.currentPhotoPath = null;
            } else if (intent == null) {
            } else {
                ImageScale.Companion $r4 = ImageScale.Companion;
                FragmentActivity $r5 = requireActivity();
                Context $r6 = $r5.getApplicationContext();
                Log_OC.loadImage($r6, "requireActivity().applicationContext");
                String $r7 = $r4.getImageFilePath(intent, $r6);
                String $r8 = $r7;
                if ($r7 == null) {
                    $r8 = "";
                }
                this.currentPhotoPath = $r8;
                ImageView $r9 = getImageView();
                ImageView $r10 = $r3.image1;
                boolean $z0 = Log_OC.append($r9, $r10);
                if ($z0) {
                    this.firstImage = String.valueOf(this.currentPhotoPath);
                    File $r11 = createImageFile();
                    this.firstFile = $r11;
                    AddImageViewBinding $r12 = $r3.include4;
                    View $r13 = $r12.getRoot();
                    Log_OC.loadImage($r13, "include4.root");
                    View r15 = $r13;
                    ViewExtKt.show(r15);
                } else {
                    ImageView $r102 = $r3.image2;
                    boolean $z02 = Log_OC.append($r9, $r102);
                    if ($z02) {
                        this.secondImage = String.valueOf(this.currentPhotoPath);
                        File $r112 = createImageFile();
                        this.secondFile = $r112;
                        AddImageViewBinding $r122 = $r3.include5;
                        View $r132 = $r122.getRoot();
                        Log_OC.loadImage($r132, "include5.root");
                        View r152 = $r132;
                        ViewExtKt.show(r152);
                    } else {
                        ImageView $r103 = $r3.image3;
                        boolean $z03 = Log_OC.append($r9, $r103);
                        if ($z03) {
                            this.thirdImage = String.valueOf(this.currentPhotoPath);
                            File $r113 = createImageFile();
                            this.thirdFile = $r113;
                        }
                    }
                }
                ImageView $r92 = getImageView();
                Uri $r14 = intent.getData();
                $r92.setImageURI($r14);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(ISSUE);
        IssueTypeModel $r3 = (IssueTypeModel) $r2;
        this.issueData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentDelayedKtatopUpBinding $r4 = FragmentDelayedKtatopUpBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
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
        if (i == 0) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    openFromFile();
                    return;
                }
            }
            Context $r1 = getContext();
            if ($r1 == null) {
                return;
            }
            ContextExtKt.toast$default($r1, "We need to access your file storage to continue.", 0, 2, (Object) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setUpViews();
    }

    public final void setDelayedKTAViewModel(DelayedKTAViewModel delayedKTAViewModel) {
        Log_OC.getArray(delayedKTAViewModel, "<set-?>");
        this.delayedKTAViewModel = delayedKTAViewModel;
    }

    public final void setImageView(ImageView imageView) {
        Log_OC.getArray(imageView, "<set-?>");
        this.imageView = imageView;
    }
}
