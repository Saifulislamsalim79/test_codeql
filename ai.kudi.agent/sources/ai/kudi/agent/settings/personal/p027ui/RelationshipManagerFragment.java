package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.domain.room_entities.RelationshipManager;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentRelationshipManagerBinding;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.settings.personal.p027ui.viewModels.RelationshipMgrViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.RelationshipMgrViewData;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: RelationshipManagerFragment.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0014J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u000202H\u0002R\u001c\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/RelationshipManagerFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/RelationshipMgrViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/RelationshipMgrViewData;", "Lai/kudi/agent/databinding/FragmentRelationshipManagerBinding;", "()V", "emptyHistoryTextView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getEmptyHistoryTextView", "()Landroid/widget/TextView;", AttributeType.LIST, "", "Lai/kudi/agent/settings/data/models/TwoColumnItem;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "managerId", "", "phoneNumber", "relationshipMgrViewModel", "getRelationshipMgrViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/RelationshipMgrViewModel;", "setRelationshipMgrViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/RelationshipMgrViewModel;)V", "twoColumnTableAdapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupRecyclerView", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.RelationshipManagerFragment */
/* loaded from: classes.dex */
public final class RelationshipManagerFragment extends BaseMVVMViewBindingFragment<RelationshipMgrViewModel, RelationshipMgrViewData, FragmentRelationshipManagerBinding> {
    public static final Companion Companion;
    private List<TwoColumnItem> list;
    private String managerId;
    private String phoneNumber;
    public RelationshipMgrViewModel relationshipMgrViewModel;
    private TwoColumnTableAdapter twoColumnTableAdapter;

    /* compiled from: RelationshipManagerFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/RelationshipManagerFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/personal/ui/RelationshipManagerFragment;", "managerId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.RelationshipManagerFragment$Companion */
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
        public final RelationshipManagerFragment newInstance(String str) {
            Log_OC.getArray(str, "managerId");
            RelationshipManagerFragment $r3 = new RelationshipManagerFragment();
            Bundle $r1 = new Bundle();
            $r1.putString(Constants.MANAGER_ID, str);
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
    public RelationshipManagerFragment() {
        ArrayList $r1 = new ArrayList();
        this.list = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getEmptyHistoryTextView() {
        View $r1 = requireView();
        TextView $r2 = (TextView) $r1.findViewById(C0001R.C0003id.emptyHistoryTextView);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final RelationshipManagerFragment newInstance(String str) {
        Companion $r0 = Companion;
        RelationshipManagerFragment $r1 = $r0.newInstance(str);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m40815onViewCreated$lambda2(RelationshipManagerFragment relationshipManagerFragment, View view) {
        String $r2;
        Log_OC.getArray(relationshipManagerFragment, "this$0");
        String $r22 = relationshipManagerFragment.phoneNumber;
        if ($r22 == null) {
            return;
        }
        FragmentActivity $r3 = relationshipManagerFragment.requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        $r2 = C13277t.m5390k0($r22, "0");
        AppCompatActivityExtKt.openLink($r3, Log_OC.m10359a("http://api.whatsapp.com/send?phone=+234", (Object) $r2));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupRecyclerView(LinearLayoutManager linearLayoutManager) {
        InterfaceC8209a $r3 = requireBinding();
        FragmentRelationshipManagerBinding $r4 = (FragmentRelationshipManagerBinding) $r3;
        RecyclerView $r5 = $r4.relationshipMgrRv;
        $r5.setLayoutManager(linearLayoutManager);
        RecyclerView r11 = $r5;
        Context $r6 = r11.getContext();
        int $i0 = linearLayoutManager.m35389v2();
        C1723k r9 = new C1723k($r6, $i0);
        RecyclerView r112 = $r5;
        Context $r62 = r112.getContext();
        Log_OC.loadImage($r62, "context");
        Drawable $r7 = ContextExtKt.getKudiDrawable($r62, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r7);
        r9.m34703f($r7);
        $r5.m35294h(r9);
        TwoColumnTableAdapter r10 = new TwoColumnTableAdapter();
        this.twoColumnTableAdapter = r10;
        $r5.setAdapter(r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        RelationshipMgrViewData $r2 = (RelationshipMgrViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(RelationshipMgrViewData relationshipMgrViewData) {
        List $r15;
        Log_OC.getArray(relationshipMgrViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentRelationshipManagerBinding $r3 = (FragmentRelationshipManagerBinding) $r2;
        boolean $z0 = relationshipMgrViewData instanceof RelationshipMgrViewData.Loading;
        if ($z0) {
            View $r4 = $r3.cardView;
            Log_OC.loadImage($r4, "cardView");
            View r22 = $r4;
            ViewExtKt.hide$default(r22, false, 1, null);
            View $r5 = $r3.loadingState;
            Log_OC.loadImage($r5, "loadingState");
            View r222 = $r5;
            ViewExtKt.show(r222);
            TextView $r6 = $r3.chatOnWhatsappButton;
            Log_OC.loadImage($r6, "chatOnWhatsappButton");
            ViewExtKt.hide$default($r6, false, 1, null);
            return;
        }
        boolean $z02 = relationshipMgrViewData instanceof RelationshipMgrViewData.RelationshipManagerData;
        if (!$z02) {
            boolean $z03 = relationshipMgrViewData instanceof RelationshipMgrViewData.Error;
            if ($z03) {
                EmptyHistoryBinding $r17 = $r3.errorState;
                View $r18 = $r17.getRoot();
                Log_OC.loadImage($r18, "errorState.root");
                View r223 = $r18;
                ViewExtKt.show(r223);
                View $r52 = $r3.loadingState;
                Log_OC.loadImage($r52, "loadingState");
                View r224 = $r52;
                ViewExtKt.hide$default(r224, false, 1, null);
                TextView $r62 = getEmptyHistoryTextView();
                Log_OC.loadImage($r62, "emptyHistoryTextView");
                ViewExtKt.hide$default($r62, false, 1, null);
                FragmentActivity $r19 = requireActivity();
                Log_OC.loadImage($r19, "requireActivity()");
                RelationshipMgrViewData.Error $r20 = (RelationshipMgrViewData.Error) relationshipMgrViewData;
                ContextExtKt.toast$default($r19, $r20.getMessage(), 0, 2, (Object) null);
                return;
            }
            return;
        }
        TextView $r63 = $r3.chatOnWhatsappButton;
        Log_OC.loadImage($r63, "chatOnWhatsappButton");
        ViewExtKt.show($r63);
        View $r42 = $r3.cardView;
        Log_OC.loadImage($r42, "cardView");
        View r225 = $r42;
        ViewExtKt.show(r225);
        View $r53 = $r3.loadingState;
        Log_OC.loadImage($r53, "loadingState");
        View r226 = $r53;
        ViewExtKt.hide$default(r226, false, 1, null);
        RelationshipMgrViewData.RelationshipManagerData $r7 = (RelationshipMgrViewData.RelationshipManagerData) relationshipMgrViewData;
        RelationshipManager $r8 = $r7.getRelationshipManager();
        String $r9 = $r8.getContactPhoneNumber();
        this.phoneNumber = $r9;
        if ($r9 == null) {
            TextView $r64 = $r3.chatOnWhatsappButton;
            Log_OC.loadImage($r64, "chatOnWhatsappButton");
            ViewExtKt.hide$default($r64, false, 1, null);
        }
        TwoColumnItem[] $r10 = new TwoColumnItem[3];
        String $r92 = getString(C0001R.string.name);
        Object[] $r12 = new Object[2];
        RelationshipManager $r82 = $r7.getRelationshipManager();
        String $r13 = $r82.getFirstName();
        String $r14 = $r13;
        if ($r13 == null) {
            String $r132 = getString(C0001R.string.nill);
            $r14 = $r132;
            Log_OC.loadImage($r132, "getString(R.string.nill)");
        }
        $r12[0] = $r14;
        RelationshipManager $r83 = $r7.getRelationshipManager();
        String $r133 = $r83.getLastName();
        String $r142 = $r133;
        if ($r133 == null) {
            String $r134 = getString(C0001R.string.nill);
            $r142 = $r134;
            Log_OC.loadImage($r134, "getString(R.string.nill)");
        }
        $r12[1] = $r142;
        String $r143 = getString(C0001R.string.relationship_mgr_name, $r12);
        TwoColumnItem.SimpleItem r21 = new TwoColumnItem.SimpleItem($r92, $r143);
        $r10[0] = r21;
        String $r93 = getString(C0001R.string.phone_number);
        RelationshipManager $r84 = $r7.getRelationshipManager();
        String $r135 = $r84.getContactPhoneNumber();
        String $r144 = $r135;
        if ($r135 == null) {
            String $r136 = getString(C0001R.string.nill);
            $r144 = $r136;
            Log_OC.loadImage($r136, "getString(R.string.nill)");
        }
        TwoColumnItem.SimpleItem r212 = new TwoColumnItem.SimpleItem($r93, $r144);
        $r10[1] = r212;
        String $r94 = getString(C0001R.string.email);
        RelationshipManager $r85 = $r7.getRelationshipManager();
        String $r137 = $r85.getOfficialEmail();
        String $r145 = $r137;
        if ($r137 == null) {
            String $r138 = getString(C0001R.string.nill);
            $r145 = $r138;
            Log_OC.loadImage($r138, "getString(R.string.nill)");
        }
        TwoColumnItem.SimpleItem r213 = new TwoColumnItem.SimpleItem($r94, $r145);
        $r10[2] = r213;
        $r15 = C13726r.m3885k($r10);
        setList($r15);
        TwoColumnTableAdapter $r16 = this.twoColumnTableAdapter;
        if ($r16 == null) {
            return;
        }
        List $r152 = getList();
        $r16.setData($r152);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        RelationshipMgrViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public RelationshipMgrViewModel createViewModel() {
        RelationshipMgrViewModel $r1 = getRelationshipMgrViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getList() {
        List r1 = this.list;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RelationshipMgrViewModel getRelationshipMgrViewModel() {
        RelationshipMgrViewModel $r1 = this.relationshipMgrViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("relationshipMgrViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return RelationshipMgrViewModel.class;
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(Constants.MANAGER_ID);
        this.managerId = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentRelationshipManagerBinding $r4 = FragmentRelationshipManagerBinding.inflate(layoutInflater, viewGroup, false);
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
        String $r3 = getString(C0001R.string.relationship_manager);
        Log_OC.loadImage($r3, "getString(R.string.relationship_manager)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        Context $r5 = requireContext();
        LinearLayoutManager $r4 = new LinearLayoutManager($r5);
        setupRecyclerView($r4);
        InterfaceC8209a $r6 = requireBinding();
        FragmentRelationshipManagerBinding $r7 = (FragmentRelationshipManagerBinding) $r6;
        TextView $r8 = $r7.chatOnWhatsappButton;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RelationshipManagerFragment $r2 = RelationshipManagerFragment.this;
                RelationshipManagerFragment.m40815onViewCreated$lambda2($r2, view2);
            }
        });
        RelationshipMgrViewModel $r10 = getRelationshipMgrViewModel();
        $r10.fetchRelationShipMgr();
    }

    public final void setList(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.list = list;
    }

    public final void setRelationshipMgrViewModel(RelationshipMgrViewModel relationshipMgrViewModel) {
        Log_OC.getArray(relationshipMgrViewModel, "<set-?>");
        this.relationshipMgrViewModel = relationshipMgrViewModel;
    }
}
