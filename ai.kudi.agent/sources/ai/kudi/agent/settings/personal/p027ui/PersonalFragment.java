package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.data.BillerKt;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ImageViewExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.databinding.EditOutletDetailsViewBinding;
import ai.kudi.agent.databinding.FragmentPersonalBinding;
import ai.kudi.agent.databinding.ProfileInfoViewBinding;
import ai.kudi.agent.databinding.UnverifiedUserViewBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.outlet_mgt.data.OutletParent;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.settings.personal.p027ui.viewModels.PersonalViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PersonalFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u0002J\u0010\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u0002J\u0010\u00102\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u0002J\u0010\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u0002J\u0010\u00104\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u0014J\b\u00105\u001a\u00020\u0002H\u0014J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u000207H\u0014J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=H\u0016J&\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u001a\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010H\u001a\u00020/H\u0002J\b\u0010I\u001a\u00020/H\u0002J\b\u0010J\u001a\u00020/H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006K"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/PersonalFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData;", "Lai/kudi/agent/databinding/FragmentPersonalBinding;", "()V", "adapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "getAdapter", "()Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "setAdapter", "(Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;)V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "isBvnVerified", "", "()Z", "setBvnVerified", "(Z)V", "isOutlet", "managerId", "", "outletInfoTwoColumnAdapter", "phoneNum", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "getSettingsNavigator", "()Lai/kudi/agent/settings/navigators/SettingsNavigator;", "setSettingsNavigator", "(Lai/kudi/agent/settings/navigators/SettingsNavigator;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "vm", "getVm", "()Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;", "setVm", "(Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;)V", "applyError", "", "viewData", "applyLoading", "applyOutletParentDetails", "applyUserProfile", "applyViewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "initAdapter", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpRecyclerView", "setUpView", "startEditProfile", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.PersonalFragment */
/* loaded from: classes.dex */
public final class PersonalFragment extends BaseMVVMViewBindingFragment<PersonalViewModel, PersonalViewData, FragmentPersonalBinding> {
    public TwoColumnTableAdapter adapter;
    public Analytics analytics;
    private boolean isBvnVerified;
    private boolean isOutlet;
    private String managerId;
    private TwoColumnTableAdapter outletInfoTwoColumnAdapter;
    private String phoneNum;
    public SettingsNavigator settingsNavigator;
    public SharedPreferences sharedPreferences;
    public PersonalViewModel srv;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyError(PersonalViewData personalViewData) {
        FragmentActivity $r4;
        FragmentActivity $r42;
        FragmentActivity $r43;
        PersonalViewData.Error $r2 = personalViewData.getError();
        if ($r2 == null) {
            return;
        }
        String $r3 = $r2.getMessage();
        if ($r3 != null && ($r43 = getActivity()) != null) {
            ContextExtKt.toast$default($r43, $r3, 0, 2, (Object) null);
        }
        String $r32 = $r2.getCacheError();
        if ($r32 != null && ($r42 = getActivity()) != null) {
            ContextExtKt.toast$default($r42, $r32, 0, 2, (Object) null);
        }
        String $r33 = $r2.getParentOutletError();
        if ($r33 == null || ($r4 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r4, $r33, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyLoading(PersonalViewData personalViewData) {
        boolean $z0 = personalViewData.isFetching();
        if ($z0) {
            FragmentActivity $r2 = getActivity();
            if ($r2 == null) {
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r4;
            }
            SettingsActivity $r3 = (SettingsActivity) $r2;
            $r3.showLoader();
            return;
        }
        FragmentActivity $r22 = getActivity();
        if ($r22 == null) {
            NullPointerException $r42 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r42;
        }
        SettingsActivity $r32 = (SettingsActivity) $r22;
        $r32.hideLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyOutletParentDetails(PersonalViewData personalViewData) {
        TwoColumnTableAdapter $r1;
        List $r8;
        OutletParent $r3 = personalViewData.getOutletDetails();
        if ($r3 == null || ($r1 = this.outletInfoTwoColumnAdapter) == null) {
            return;
        }
        TwoColumnItem[] $r4 = new TwoColumnItem[8];
        String $r6 = getString(C0001R.string.f33382bvn);
        boolean $z0 = $r3.getBvnVerified();
        String $r7 = $z0 ? getString(C0001R.string.verified) : getString(C0001R.string.unverified);
        TwoColumnItem.SimpleItem $r5 = new TwoColumnItem.SimpleItem($r6, $r7);
        $r4[0] = $r5;
        String $r62 = getString(C0001R.string.email);
        String $r72 = $r3.getEmail();
        TwoColumnItem.SimpleItem $r52 = new TwoColumnItem.SimpleItem($r62, $r72);
        $r4[1] = $r52;
        String $r63 = getString(C0001R.string.date_of_birth);
        String $r73 = $r3.getDob();
        TwoColumnItem.SimpleItem $r53 = new TwoColumnItem.SimpleItem($r63, $r73);
        $r4[2] = $r53;
        String $r64 = getString(C0001R.string.gender);
        String $r74 = $r3.getGender();
        TwoColumnItem.SimpleItem $r54 = new TwoColumnItem.SimpleItem($r64, $r74);
        $r4[3] = $r54;
        String $r65 = getString(C0001R.string.business_name);
        String $r75 = $r3.getBusinessName();
        TwoColumnItem.SimpleItem $r55 = new TwoColumnItem.SimpleItem($r65, $r75);
        $r4[4] = $r55;
        String $r66 = getString(C0001R.string.address);
        String $r76 = $r3.getBusinessAddress();
        TwoColumnItem.SimpleItem $r56 = new TwoColumnItem.SimpleItem($r66, $r76);
        $r4[5] = $r56;
        String $r67 = getString(C0001R.string.state);
        String $r77 = $r3.getState();
        TwoColumnItem.SimpleItem $r57 = new TwoColumnItem.SimpleItem($r67, $r77);
        $r4[6] = $r57;
        String $r68 = getString(C0001R.string.vibrate_on_keypress);
        String $r78 = $r3.getLocalGovernmentArea();
        TwoColumnItem.SimpleItem $r58 = new TwoColumnItem.SimpleItem($r68, $r78);
        $r4[7] = $r58;
        $r8 = C13726r.m3885k($r4);
        $r1.setData($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyUserProfile(PersonalViewData personalViewData) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentPersonalBinding $r3 = (FragmentPersonalBinding) $r2;
        UserProfile $r4 = personalViewData.getUserProfile();
        if ($r4 == null) {
            return;
        }
        String $r5 = $r4.getManagerId();
        if ($r5 != null) {
            TextView $r6 = $r3.relationshipMgrButton;
            Log_OC.loadImage($r6, "relationshipMgrButton");
            ViewExtKt.show($r6);
            String $r52 = $r4.getManagerId();
            this.managerId = $r52;
        }
        TextView $r7 = $r3.nameView;
        if ($r7 != null) {
            Object[] $r8 = new Object[2];
            String $r9 = $r4.getFirstName();
            String $r10 = $r9;
            String $r53 = BillerKt.NAMEPROMPT_NA;
            if ($r9 == null) {
                $r10 = BillerKt.NAMEPROMPT_NA;
            }
            $r8[0] = $r10;
            String $r92 = $r4.getLastName();
            if ($r92 != null) {
                $r53 = $r92;
            }
            $r8[1] = $r53;
            CharSequence $r54 = getString(C0001R.string.relationship_mgr_name, $r8);
            TextView $r62 = $r7;
            $r62.setText($r54);
        }
        TextView $r72 = $r3.phoneNoView;
        CharSequence $r55 = $r4.getPhoneNumber();
        TextView $r63 = $r72;
        $r63.setText($r55);
        String $r56 = $r4.getPhoneNumber();
        String $r93 = $r56;
        if ($r56 == null) {
            $r93 = "";
        }
        this.phoneNum = $r93;
        ImageView $r11 = $r3.circleImageView;
        Log_OC.loadImage($r11, "circleImageView");
        FragmentActivity $r12 = requireActivity();
        Log_OC.loadImage($r12, "requireActivity()");
        ImageUtil.Companion $r13 = ImageUtil.Companion;
        String $r57 = $r4.getProfileImage();
        ImageView r19 = $r11;
        ImageViewExtKt.load(r19, $r12, $r13.getRemotePathImageId($r57));
        boolean $z0 = $r4.getBvnIsVerified();
        if ($z0) {
            boolean $z02 = $r4.getBvnIsVerified();
            setBvnVerified($z02);
            UnverifiedUserViewBinding $r14 = $r3.unverifiedUserView;
            View $r15 = $r14.getRoot();
            Log_OC.loadImage($r15, "unverifiedUserView.root");
            View r20 = $r15;
            ViewExtKt.hide$default(r20, false, 1, null);
            Boolean $r16 = personalViewData.isProfileInComplete();
            if ($r16 != null) {
                boolean $z03 = $r16.booleanValue();
                if ($z03) {
                    ProfileInfoViewBinding $r17 = $r3.include2;
                    TextView $r64 = $r17.profileCompletionTextView;
                    Context $r18 = requireContext();
                    int $i0 = C1335a.m36324d($r18, C0001R.color.kudiBadgeDarkRed);
                    $r64.setTextColor($i0);
                    ProfileInfoViewBinding $r172 = $r3.include2;
                    TextView $r65 = $r172.profileCompletionTextView;
                    Context $r182 = requireContext();
                    int $i02 = C1335a.m36324d($r182, C0001R.color.kudiBadgeLightRed);
                    $r65.setBackgroundColor($i02);
                    ProfileInfoViewBinding $r173 = $r3.include2;
                    TextView $r66 = $r173.profileCompletionTextView;
                    String $r58 = getString(C0001R.string.incomplete);
                    $r66.setText($r58);
                } else {
                    ProfileInfoViewBinding $r174 = $r3.include2;
                    TextView $r67 = $r174.profileCompletionTextView;
                    Context $r183 = requireContext();
                    int $i03 = C1335a.m36324d($r183, C0001R.color.kudiBadgeDarkGreen);
                    $r67.setTextColor($i03);
                    ProfileInfoViewBinding $r175 = $r3.include2;
                    TextView $r68 = $r175.profileCompletionTextView;
                    Context $r184 = requireContext();
                    int $i04 = C1335a.m36324d($r184, C0001R.color.kudiBadgeLightGreen);
                    $r68.setBackgroundColor($i04);
                    ProfileInfoViewBinding $r176 = $r3.include2;
                    TextView $r69 = $r176.profileCompletionTextView;
                    String $r59 = getString(C0001R.string.complete);
                    $r69.setText($r59);
                }
            }
        } else {
            UnverifiedUserViewBinding $r142 = $r3.unverifiedUserView;
            View $r152 = $r142.getRoot();
            Log_OC.loadImage($r152, "unverifiedUserView.root");
            View r202 = $r152;
            ViewExtKt.show(r202);
            boolean $z04 = $r4.getBvnIsVerified();
            setBvnVerified($z04);
            UnverifiedUserViewBinding $r143 = $r3.unverifiedUserView;
            TextView $r73 = $r143.statusView;
            CharSequence $r510 = getString(C0001R.string.unverified);
            TextView $r610 = $r73;
            $r610.setText($r510);
        }
        initAdapter($r4);
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x017c */
    /* JADX WARN: Incorrect condition in loop: B:16:0x01c3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initAdapter(ai.kudi.agent.core.domain.room_entities.UserProfile r43) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.PersonalFragment.initAdapter(ai.kudi.agent.core.domain.room_entities.UserProfile):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpRecyclerView() {
        TwoColumnTableAdapter r11 = new TwoColumnTableAdapter();
        setAdapter(r11);
        Context $r3 = getContext();
        C1723k r12 = new C1723k($r3, 1);
        Context $r32 = requireContext();
        Drawable $r4 = C1335a.m36322f($r32, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r4);
        r12.m34703f($r4);
        InterfaceC8209a $r5 = requireBinding();
        FragmentPersonalBinding $r6 = (FragmentPersonalBinding) $r5;
        ProfileInfoViewBinding $r7 = $r6.include2;
        RecyclerView $r8 = $r7.recyclerView;
        $r8.m35294h(r12);
        ProfileInfoViewBinding $r72 = $r6.include2;
        RecyclerView $r82 = $r72.recyclerView;
        FragmentActivity $r10 = getActivity();
        LinearLayoutManager r13 = new LinearLayoutManager($r10);
        $r82.setLayoutManager(r13);
        ProfileInfoViewBinding $r73 = $r6.include2;
        ViewGroup $r83 = $r73.recyclerView;
        ViewGroup r14 = $r83;
        r14.setFocusable(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpView() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentPersonalBinding $r2 = (FragmentPersonalBinding) $r1;
        setUpRecyclerView();
        UnverifiedUserViewBinding $r3 = $r2.unverifiedUserView;
        TextView $r4 = $r3.verifyButton;
        TextView $r7 = $r4;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalFragment $r22 = PersonalFragment.this;
                PersonalFragment.m40811setUpView$lambda20$lambda15($r22, view);
            }
        });
        EditOutletDetailsViewBinding $r6 = $r2.editOutletDetailsView;
        TextView $r72 = $r6.editProfileView;
        $r72.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalFragment $r22 = PersonalFragment.this;
                PersonalFragment.m40812setUpView$lambda20$lambda16($r22, view);
            }
        });
        ProfileInfoViewBinding $r9 = $r2.include2;
        TextView $r73 = $r9.editProfile;
        $r73.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalFragment $r22 = PersonalFragment.this;
                PersonalFragment.m40813setUpView$lambda20$lambda17($r22, view);
            }
        });
        TextView $r74 = $r2.relationshipMgrButton;
        $r74.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalFragment $r22 = PersonalFragment.this;
                PersonalFragment.m40814setUpView$lambda20$lambda19($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-20$lambda-15  reason: not valid java name */
    public static final void m40811setUpView$lambda20$lambda15(PersonalFragment personalFragment, View view) {
        Log_OC.getArray(personalFragment, "this$0");
        Analytics $r2 = personalFragment.getAnalytics();
        String $r3 = personalFragment.phoneNum;
        if ($r3 == null) {
            $r3 = "";
        }
        $r2.onVerifyAccountButtonClick($r3);
        FragmentActivity $r5 = personalFragment.getActivity();
        Intent $r4 = new Intent($r5, BvnExistingAgentActivity.class);
        $r4.putExtra("phoneNo", personalFragment.phoneNum);
        $r4.putExtra(Constants.IS_NEW_USER, false);
        $r4.putExtra(LoginParams.SHOULD_FORCE_KYC_UPGRADE, false);
        C13666w c13666w = C13666w.f30112a;
        personalFragment.startActivityForResult($r4, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-20$lambda-16  reason: not valid java name */
    public static final void m40812setUpView$lambda20$lambda16(PersonalFragment personalFragment, View view) {
        Log_OC.getArray(personalFragment, "this$0");
        boolean $z0 = personalFragment.isOutlet;
        if ($z0) {
            personalFragment.startEditProfile();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpView$lambda-20$lambda-17  reason: not valid java name */
    public static final void m40813setUpView$lambda20$lambda17(PersonalFragment personalFragment, View view) {
        Log_OC.getArray(personalFragment, "this$0");
        personalFragment.startEditProfile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-20$lambda-19  reason: not valid java name */
    public static final void m40814setUpView$lambda20$lambda19(PersonalFragment personalFragment, View view) {
        Log_OC.getArray(personalFragment, "this$0");
        String $r3 = personalFragment.managerId;
        if ($r3 == null) {
            return;
        }
        SettingsNavigator $r0 = personalFragment.getSettingsNavigator();
        $r0.toRelationshipManager($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void startEditProfile() {
        SettingsNavigator $r1 = getSettingsNavigator();
        boolean $z0 = this.isBvnVerified;
        $r1.toEditProfileFragment($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PersonalViewData $r2 = (PersonalViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(PersonalViewData personalViewData) {
        Log_OC.getArray(personalViewData, "viewData");
        applyLoading(personalViewData);
        applyUserProfile(personalViewData);
        applyOutletParentDetails(personalViewData);
        applyError(personalViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PersonalViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PersonalViewModel createViewModel() {
        PersonalViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TwoColumnTableAdapter getAdapter() {
        TwoColumnTableAdapter $r1 = this.adapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("adapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SettingsNavigator getSettingsNavigator() {
        SettingsNavigator $r1 = this.settingsNavigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("settingsNavigator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PersonalViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PersonalViewModel getVm() {
        PersonalViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isBvnVerified() {
        boolean z0 = this.isBvnVerified;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPersonalBinding $r4 = FragmentPersonalBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r3 = getActivity();
            if ($r3 == null) {
                NullPointerException r19 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw r19;
            }
            SettingsActivity $r4 = (SettingsActivity) $r3;
            String $r5 = getString(C0001R.string.personal_information);
            Log_OC.loadImage($r5, "getString(R.string.personal_information)");
            $r4.setTitle($r5);
        }
        SharedPreferences $r7 = getSharedPreferences();
        boolean $z02 = $r7.getBoolean(LoginParams.EXTRA_IS_OUTLET, false);
        this.isOutlet = $z02;
        InterfaceC8209a $r8 = requireBinding();
        FragmentPersonalBinding $r9 = (FragmentPersonalBinding) $r8;
        boolean $z03 = this.isOutlet;
        if ($z03) {
            EditOutletDetailsViewBinding $r10 = $r9.editOutletDetailsView;
            TextView $r11 = $r10.textView12;
            CharSequence $r52 = getString(C0001R.string.outlet_information);
            TextView $r12 = $r11;
            $r12.setText($r52);
            EditOutletDetailsViewBinding $r102 = $r9.editOutletDetailsView;
            TextView $r122 = $r102.editProfileView;
            String $r53 = getString(C0001R.string.edit_outlet_details);
            $r122.setText($r53);
            ProfileInfoViewBinding $r13 = $r9.include2;
            TextView $r123 = $r13.textView17;
            Context $r14 = getContext();
            String $r54 = $r14 == null ? null : $r14.getString(C0001R.string.business_information);
            $r123.setText($r54);
            ProfileInfoViewBinding $r132 = $r9.include2;
            TextView $r124 = $r132.editProfile;
            Log_OC.loadImage($r124, "include2.editProfile");
            ViewExtKt.hide$default($r124, false, 1, null);
            TwoColumnTableAdapter r20 = new TwoColumnTableAdapter();
            this.outletInfoTwoColumnAdapter = r20;
            ProfileInfoViewBinding $r133 = $r9.include2;
            RecyclerView $r16 = $r133.recyclerView;
            RecyclerView r22 = $r16;
            LinearLayoutManager r21 = new LinearLayoutManager(r22.getContext());
            $r16.setLayoutManager(r21);
            TwoColumnTableAdapter $r15 = this.outletInfoTwoColumnAdapter;
            $r16.setAdapter($r15);
            PersonalViewModel $r18 = getVm();
            $r18.fetchParentDetails();
        }
        PersonalViewModel $r182 = getVm();
        $r182.start();
        setUpView();
    }

    public final void setAdapter(TwoColumnTableAdapter twoColumnTableAdapter) {
        Log_OC.getArray(twoColumnTableAdapter, "<set-?>");
        this.adapter = twoColumnTableAdapter;
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setBvnVerified(boolean z) {
        this.isBvnVerified = z;
    }

    public final void setSettingsNavigator(SettingsNavigator settingsNavigator) {
        Log_OC.getArray(settingsNavigator, "<set-?>");
        this.settingsNavigator = settingsNavigator;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setVm(PersonalViewModel personalViewModel) {
        Log_OC.getArray(personalViewModel, "<set-?>");
        this.srv = personalViewModel;
    }
}
