package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentContactUsBinding;
import ai.kudi.agent.issues.p008ui.viewModels.ContactUsViewModel;
import ai.kudi.agent.login.domain.LoginParams;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import dagger.android.p197e.C7429a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ContactUsFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\u001a\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010,\u001a\u00020\u0012H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006."}, m10421d2 = {"Lai/kudi/agent/issues/ui/ContactUsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel;", "Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel$ContactUsViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentContactUsBinding;", "()V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel;", "setScreenViewModel", "(Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "launchWebsite", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onResume", "onViewCreated", "view", "rateMe", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.ContactUsFragment */
/* loaded from: classes.dex */
public final class ContactUsFragment extends BaseMVVMViewBindingFragment<ContactUsViewModel, ContactUsViewModel.ContactUsViewData, FragmentContactUsBinding> {
    public static final Companion Companion;
    public static final String SOCIAL_FB = "Facebook";
    public static final String SOCIAL_INSTAGRAM = "Instagram";
    public static final String SOCIAL_TWITTER = "twitter";
    public Frame remoteConfig;
    public ContactUsViewModel screenViewModel;

    /* compiled from: ContactUsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/ui/ContactUsFragment$Companion;", "", "()V", "SOCIAL_FB", "", "SOCIAL_INSTAGRAM", "SOCIAL_TWITTER", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.ContactUsFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
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
    private final void launchWebsite(String str) {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r4;
        }
        IssueActivity $r3 = (IssueActivity) $r1;
        $r3.launchWebsite(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10  reason: not valid java name */
    public static final void m39452onViewCreated$lambda11$lambda10(FragmentContactUsBinding fragmentContactUsBinding, final ContactUsFragment contactUsFragment, Item item) {
        Log_OC.getArray(fragmentContactUsBinding, "$this_apply");
        Log_OC.getArray(contactUsFragment, "this$0");
        Log_OC.getArray(item, "task");
        boolean $z0 = item.m27801a();
        if ($z0) {
            ViewGroup $r3 = fragmentContactUsBinding.kudiButton;
            ViewGroup r26 = $r3;
            r26.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39453onViewCreated$lambda11$lambda10$lambda0($r2, view);
                }
            });
            ViewGroup $r32 = fragmentContactUsBinding.kudiButton2;
            ViewGroup r262 = $r32;
            r262.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.k
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39454onViewCreated$lambda11$lambda10$lambda1($r2, view);
                }
            });
            TextView $r6 = fragmentContactUsBinding.reveiwAppView;
            $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.j
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39455onViewCreated$lambda11$lambda10$lambda2($r2, view);
                }
            });
            TextView $r62 = fragmentContactUsBinding.checkAppBuildView;
            $r62.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.ActivityMain$8
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39456onViewCreated$lambda11$lambda10$lambda3($r2, view);
                }
            });
            TextView $r63 = fragmentContactUsBinding.visitWebsiteView;
            $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.TimePicker$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39457onViewCreated$lambda11$lambda10$lambda4($r2, view);
                }
            });
            TextView $r64 = fragmentContactUsBinding.checkFaqsView;
            $r64.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.TimePicker$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39458onViewCreated$lambda11$lambda10$lambda5($r2, view);
                }
            });
            TextView $r65 = fragmentContactUsBinding.termsandConditionView;
            $r65.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.NoteEditor$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39459onViewCreated$lambda11$lambda10$lambda6($r2, view);
                }
            });
            ImageView $r12 = fragmentContactUsBinding.instagramView;
            $r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.DebugLogActivity$5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39460onViewCreated$lambda11$lambda10$lambda7($r2, view);
                }
            });
            ImageView $r122 = fragmentContactUsBinding.twitterView;
            $r122.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.DebugLogActivity$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39461onViewCreated$lambda11$lambda10$lambda8($r2, view);
                }
            });
            ImageView $r123 = fragmentContactUsBinding.faceBookView;
            $r123.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.AndroidUtilities$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactUsFragment $r2 = ContactUsFragment.this;
                    ContactUsFragment.m39462onViewCreated$lambda11$lambda10$lambda9($r2, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-0  reason: not valid java name */
    public static final void m39453onViewCreated$lambda11$lambda10$lambda0(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        FragmentActivity $r2 = contactUsFragment.getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r5;
        }
        IssueActivity $r3 = (IssueActivity) $r2;
        $r3.makeACall(LoginParams.ONBOARDING_SUPPORT);
        ContactUsViewModel $r4 = contactUsFragment.getScreenViewModel();
        $r4.onCallSupportClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-1  reason: not valid java name */
    public static final void m39454onViewCreated$lambda11$lambda10$lambda1(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        FragmentActivity $r0 = contactUsFragment.getActivity();
        if ($r0 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r4;
        }
        IssueActivity $r3 = (IssueActivity) $r0;
        $r3.sendEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-2  reason: not valid java name */
    public static final void m39455onViewCreated$lambda11$lambda10$lambda2(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        contactUsFragment.rateMe();
        ContactUsViewModel $r0 = contactUsFragment.getScreenViewModel();
        $r0.onReviewOurAppClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-3  reason: not valid java name */
    public static final void m39456onViewCreated$lambda11$lambda10$lambda3(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        AppVersionDialog $r2 = new AppVersionDialog();
        FragmentManager $r3 = contactUsFragment.getChildFragmentManager();
        $r2.show($r3, "AppVersion");
        ContactUsViewModel $r4 = contactUsFragment.getScreenViewModel();
        $r4.onCheckAppBuildClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-4  reason: not valid java name */
    public static final void m39457onViewCreated$lambda11$lambda10$lambda4(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        Frame $r2 = contactUsFragment.getRemoteConfig();
        String $r3 = $r2.getSetting("website_link");
        Log_OC.loadImage($r3, "remoteConfig.getString(\"website_link\")");
        contactUsFragment.launchWebsite($r3);
        ContactUsViewModel $r4 = contactUsFragment.getScreenViewModel();
        $r4.onVisitWebsiteClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-5  reason: not valid java name */
    public static final void m39458onViewCreated$lambda11$lambda10$lambda5(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        Frame $r2 = contactUsFragment.getRemoteConfig();
        String $r3 = $r2.getSetting("faq_link");
        Log_OC.loadImage($r3, "remoteConfig.getString(\"faq_link\")");
        contactUsFragment.launchWebsite($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-6  reason: not valid java name */
    public static final void m39459onViewCreated$lambda11$lambda10$lambda6(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        ContactUsViewModel $r0 = contactUsFragment.getScreenViewModel();
        $r0.toTermsFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-7  reason: not valid java name */
    public static final void m39460onViewCreated$lambda11$lambda10$lambda7(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        Frame $r2 = contactUsFragment.getRemoteConfig();
        String $r3 = $r2.getSetting("instagram_handle");
        Log_OC.loadImage($r3, "remoteConfig.getString(\"instagram_handle\")");
        contactUsFragment.launchWebsite($r3);
        ContactUsViewModel $r4 = contactUsFragment.getScreenViewModel();
        $r4.onSocialsClicked(SOCIAL_INSTAGRAM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-8  reason: not valid java name */
    public static final void m39461onViewCreated$lambda11$lambda10$lambda8(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        Frame $r2 = contactUsFragment.getRemoteConfig();
        String $r3 = $r2.getSetting("twitter_handle");
        Log_OC.loadImage($r3, "remoteConfig.getString(\"twitter_handle\")");
        contactUsFragment.launchWebsite($r3);
        ContactUsViewModel $r4 = contactUsFragment.getScreenViewModel();
        $r4.onSocialsClicked(SOCIAL_TWITTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-10$lambda-9  reason: not valid java name */
    public static final void m39462onViewCreated$lambda11$lambda10$lambda9(ContactUsFragment contactUsFragment, View view) {
        Log_OC.getArray(contactUsFragment, "this$0");
        Frame $r2 = contactUsFragment.getRemoteConfig();
        String $r3 = $r2.getSetting("facebook_profile");
        Log_OC.loadImage($r3, "remoteConfig.getString(\"facebook_profile\")");
        contactUsFragment.launchWebsite($r3);
        ContactUsViewModel $r4 = contactUsFragment.getScreenViewModel();
        $r4.onSocialsClicked(SOCIAL_FB);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void rateMe() {
        try {
            FragmentActivity $r4 = getActivity();
            String $r5 = $r4 == null ? null : $r4.getPackageName();
            Uri $r6 = Uri.parse(Log_OC.m10359a("market://details?id=", (Object) $r5));
            Intent $r3 = new Intent("android.intent.action.VIEW", $r6);
            startActivity($r3);
        } catch (ActivityNotFoundException e) {
            FragmentActivity $r42 = getActivity();
            String $r2 = $r42 != null ? $r42.getPackageName() : null;
            Uri $r62 = Uri.parse(Log_OC.m10359a("http://play.google.com/store/apps/details?id=", (Object) $r2));
            Intent $r32 = new Intent("android.intent.action.VIEW", $r62);
            startActivity($r32);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ContactUsViewModel.ContactUsViewData $r2 = (ContactUsViewModel.ContactUsViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(ContactUsViewModel.ContactUsViewData contactUsViewData) {
        Log_OC.getArray(contactUsViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ContactUsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ContactUsViewModel createViewModel() {
        ContactUsViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ContactUsViewModel getScreenViewModel() {
        ContactUsViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ContactUsViewModel.class;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentContactUsBinding $r4 = FragmentContactUsBinding.inflate(layoutInflater, viewGroup, false);
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
    public void onResume() {
        super.onResume();
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r3;
        }
        IssueActivity $r2 = (IssueActivity) $r1;
        $r2.setTitle("Contact Nomba");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r11;
        }
        IssueActivity $r4 = (IssueActivity) $r3;
        $r4.setTitle("Contact Nomba");
        FragmentActivity $r32 = getActivity();
        if ($r32 == null) {
            NullPointerException $r112 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r112;
        }
        IssueActivity $r42 = (IssueActivity) $r32;
        $r42.setIconVisibility(false);
        ContactUsViewModel $r5 = getScreenViewModel();
        $r5.onContactUsReached();
        InterfaceC8209a $r6 = requireBinding();
        final FragmentContactUsBinding $r7 = (FragmentContactUsBinding) $r6;
        Frame $r8 = getRemoteConfig();
        Item $r9 = $r8.m20914c();
        $r9.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.issues.ui.AnnotationWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: a */
            public final void m38851a(Item item) {
                FragmentContactUsBinding $r2 = FragmentContactUsBinding.this;
                ContactUsFragment $r33 = this;
                ContactUsFragment.m39452onViewCreated$lambda11$lambda10($r2, $r33, item);
            }
        });
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setScreenViewModel(ContactUsViewModel contactUsViewModel) {
        Log_OC.getArray(contactUsViewModel, "<set-?>");
        this.screenViewModel = contactUsViewModel;
    }
}
