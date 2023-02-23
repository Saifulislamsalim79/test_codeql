package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentIdTypesBinding;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycActivity;
import ai.kudi.agent.register.xmpp.components.PendingKycSubComponent;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.personal.p027ui.IdTypesAdapter;
import ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.IdTypesViewData;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: IdtypesFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0003H\u0014J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0014J\u0012\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010.\u001a\u00020\tH\u0002R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/IdtypesFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/IdTypesViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/IdTypesViewData;", "Lai/kudi/agent/databinding/FragmentIdTypesBinding;", "()V", "callback", "Lkotlin/Function1;", "Lai/kudi/agent/core/domain/room_entities/IdType;", "", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "idTypesAdapter", "Lai/kudi/agent/settings/personal/ui/IdTypesAdapter;", "getIdTypesAdapter", "()Lai/kudi/agent/settings/personal/ui/IdTypesAdapter;", "setIdTypesAdapter", "(Lai/kudi/agent/settings/personal/ui/IdTypesAdapter;)V", "idTypesViewModel", "getIdTypesViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/IdTypesViewModel;", "setIdTypesViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/IdTypesViewModel;)V", "pendingKycActivity", "Lai/kudi/agent/register/v2/ui/PendingKycActivity;", "settingsActivity", "Lai/kudi/agent/settings/ui/SettingsActivity;", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "performSearch", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.IdtypesFragment */
/* loaded from: classes.dex */
public final class IdtypesFragment extends BaseMVVMViewBindingFragment<IdTypesViewModel, IdTypesViewData, FragmentIdTypesBinding> {
    public static final Companion Companion;
    private InterfaceC11767l<? super IdType, C13666w> callback;
    public IdTypesAdapter idTypesAdapter;
    public IdTypesViewModel idTypesViewModel;
    private PendingKycActivity pendingKycActivity;
    private SettingsActivity settingsActivity;

    /* compiled from: IdtypesFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/IdtypesFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/personal/ui/IdtypesFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.IdtypesFragment$Companion */
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
        public final IdtypesFragment newInstance() {
            IdtypesFragment $r1 = new IdtypesFragment();
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
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40810onActivityCreated$lambda1$lambda0(IdtypesFragment idtypesFragment, View view) {
        Log_OC.getArray(idtypesFragment, "this$0");
        FragmentActivity $r2 = idtypesFragment.getActivity();
        boolean $z0 = $r2 instanceof SettingsActivity;
        if (!$z0) {
            FragmentActivity $r22 = idtypesFragment.requireActivity();
            $r22.onBackPressed();
            return;
        }
        FragmentActivity $r23 = idtypesFragment.getActivity();
        if ($r23 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r4;
        }
        SettingsActivity $r3 = (SettingsActivity) $r23;
        $r3.onBackPressed();
        FragmentActivity $r24 = idtypesFragment.getActivity();
        if ($r24 == null) {
            NullPointerException $r42 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r42;
        }
        SettingsActivity $r32 = (SettingsActivity) $r24;
        $r32.toggleAppBarLayout(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSearch() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentIdTypesBinding $r3 = (FragmentIdTypesBinding) $r2;
        EditText $r4 = $r3.searchView;
        $r4.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.settings.personal.ui.IdtypesFragment$performSearch$1$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IdtypesFragment $r22 = IdtypesFragment.this;
                IdTypesAdapter $r32 = $r22.getIdTypesAdapter();
                String $r42 = String.valueOf(charSequence);
                IdtypesFragment $r23 = IdtypesFragment.this;
                IdtypesFragment$performSearch$1$1$onTextChanged$1 $r5 = new IdtypesFragment$performSearch$1$1$onTextChanged$1($r23);
                $r32.search($r42, $r5);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        IdTypesViewData $r2 = (IdTypesViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:15:0x006b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.settings.personal.p027ui.viewModels.data.IdTypesViewData r23) {
        /*
            r22 = this;
            java.lang.String r2 = "viewData"
            r0 = r23
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r22
            g.x.a r3 = r0.requireBinding()
            r5 = r3
            ai.kudi.agent.databinding.FragmentIdTypesBinding r5 = (ai.kudi.agent.databinding.FragmentIdTypesBinding) r5
            r4 = r5
            r0 = r23
            boolean r6 = r0.isLoading()
            if (r6 == 0) goto L24
            android.widget.ProgressBar r7 = r4.idTypesProgressBar
            java.lang.String r2 = "idTypesProgressBar"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r2)
            ai.kudi.agent.core.util.ViewExtKt.show(r7)
            goto L31
        L24:
            android.widget.ProgressBar r7 = r4.idTypesProgressBar
            java.lang.String r2 = "idTypesProgressBar"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r2)
            r8 = 0
            r9 = 1
            r10 = 0
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r7, r8, r9, r10)
        L31:
            r0 = r23
            java.util.List r11 = r0.getIdTypes()
            if (r11 != 0) goto L3a
            goto L43
        L3a:
            r0 = r22
            ai.kudi.agent.settings.personal.ui.IdTypesAdapter r12 = r0.getIdTypesAdapter()
            r12.setData(r11)
        L43:
            r0 = r23
            java.lang.String r13 = r0.getError()
            if (r13 != 0) goto L4c
            return
        L4c:
            r0 = r22
            ai.kudi.agent.settings.personal.ui.IdTypesAdapter r12 = r0.getIdTypesAdapter()
            java.util.List r11 = ai.kudi.agent.transactions.utils.TransactionsUtilKt.getLocalIdTypes()
            java.util.ArrayList r14 = new java.util.ArrayList
            r8 = 10
            int r15 = kotlin.p557z.C13722p.m3921o(r11, r8)
            r14.<init>(r15)
            java.util.Iterator r16 = r11.iterator()
        L65:
            r0 = r16
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L9b
            r0 = r16
            java.lang.Object r17 = r0.next()
            r19 = r17
            ai.kudi.agent.transactions.utils.IdTypes r19 = (ai.kudi.agent.transactions.utils.IdTypes) r19
            r18 = r19
            ai.kudi.agent.core.domain.room_entities.IdType r20 = new ai.kudi.agent.core.domain.room_entities.IdType
            r0 = r18
            java.lang.String r13 = r0.name()
            r0 = r18
            java.lang.String r21 = r0.getId()
            r0 = r18
            int r15 = r0.getValidLength()
            r8 = 1
            r0 = r20
            r1 = r21
            r0.<init>(r13, r1, r15, r8)
            r0 = r20
            r14.add(r0)
            goto L65
        L9b:
            r12.setData(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.IdtypesFragment.applyViewData(ai.kudi.agent.settings.personal.ui.viewModels.data.IdTypesViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        IdTypesViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public IdTypesViewModel createViewModel() {
        IdTypesViewModel $r1 = getIdTypesViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getCallback() {
        InterfaceC11767l r1 = this.callback;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IdTypesAdapter getIdTypesAdapter() {
        IdTypesAdapter $r1 = this.idTypesAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("idTypesAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IdTypesViewModel getIdTypesViewModel() {
        IdTypesViewModel $r1 = this.idTypesViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("idTypesViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return IdTypesViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r2 = getActivity();
            if ($r2 == null) {
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r4;
            } else {
                SettingsActivity $r3 = (SettingsActivity) $r2;
                $r3.toggleAppBarLayout(false);
            }
        }
        InterfaceC8209a $r5 = requireBinding();
        FragmentIdTypesBinding $r6 = (FragmentIdTypesBinding) $r5;
        Context $r8 = requireContext();
        LinearLayoutManager $r7 = new LinearLayoutManager($r8);
        RecyclerView $r9 = $r6.recyclerView;
        $r9.setLayoutManager($r7);
        RecyclerView $r92 = $r6.recyclerView;
        Context $r82 = getContext();
        int $i0 = $r7.m35389v2();
        C1723k $r10 = new C1723k($r82, $i0);
        $r92.m35294h($r10);
        IdTypesAdapter $r11 = new IdTypesAdapter(null, 1, null);
        setIdTypesAdapter($r11);
        IdTypesAdapter.Companion $r12 = IdTypesAdapter.Companion;
        IdtypesFragment$onActivityCreated$1$1 $r13 = new IdtypesFragment$onActivityCreated$1$1(this);
        $r12.setClickedListener($r13);
        RecyclerView $r93 = $r6.recyclerView;
        IdTypesAdapter $r112 = getIdTypesAdapter();
        $r93.setAdapter($r112);
        performSearch();
        Toolbar $r14 = $r6.toolbar;
        $r14.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.CountdownFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdtypesFragment $r22 = IdtypesFragment.this;
                IdtypesFragment.m40810onActivityCreated$lambda1$lambda0($r22, view);
            }
        });
        EditText $r16 = $r6.searchView;
        $r16.setHint("Search Id Type");
        IdTypesViewModel $r17 = getIdTypesViewModel();
        $r17.getAndCacheIdTypes();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        SettingsSubComponent $r5;
        PendingKycSubComponent $r3;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PendingKycActivity;
        if ($z0) {
            PendingKycActivity $r2 = (PendingKycActivity) context;
            this.pendingKycActivity = $r2;
            if ($r2 == null || ($r3 = $r2.getPendingKycSubComponent()) == null) {
                return;
            }
            $r3.inject(this);
            return;
        }
        boolean $z02 = context instanceof SettingsActivity;
        if ($z02) {
            SettingsActivity $r4 = (SettingsActivity) context;
            this.settingsActivity = $r4;
            if ($r4 == null || ($r5 = $r4.getSettingsSubComponent()) == null) {
                return;
            }
            $r5.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentIdTypesBinding $r4 = FragmentIdTypesBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    public final void setCallback(InterfaceC11767l interfaceC11767l) {
        this.callback = interfaceC11767l;
    }

    public final void setIdTypesAdapter(IdTypesAdapter idTypesAdapter) {
        Log_OC.getArray(idTypesAdapter, "<set-?>");
        this.idTypesAdapter = idTypesAdapter;
    }

    public final void setIdTypesViewModel(IdTypesViewModel idTypesViewModel) {
        Log_OC.getArray(idTypesViewModel, "<set-?>");
        this.idTypesViewModel = idTypesViewModel;
    }
}
