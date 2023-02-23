package ai.kudi.agent.statesandlgapicker.dialogs;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.FragmentPickerBinding;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.register.adapter.DropDownListAdapterUpdated;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: StateFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0004J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\n0\u001aj\b\u0012\u0004\u0012\u00020\n`\u001bH\u0002J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u0012\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u000bH\u0002J\t\u0010*\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/statesandlgapicker/dialogs/StateFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/FragmentPickerBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/FragmentPickerBinding;", "callback", "Lkotlin/Function1;", "", "", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "locationAdapter", "Lai/kudi/agent/register/adapter/DropDownListAdapterUpdated;", "getLocationAdapter", "()Lai/kudi/agent/register/adapter/DropDownListAdapterUpdated;", "setLocationAdapter", "(Lai/kudi/agent/register/adapter/DropDownListAdapterUpdated;)V", "getStates", "", "Lai/kudi/agent/register/data/models/DropDownModel;", "locationList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "performSearch", "requireBinding", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StateFragment extends h implements BaseViewBinder<FragmentPickerBinding> {
    private static final String ARGS_STATES = "args_states";
    private static final String ARG_HINT_TEXT = "args_hint_text";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentPickerBinding> $$delegate_0;
    private InterfaceC11767l<? super String, C13666w> callback;
    public DropDownListAdapterUpdated locationAdapter;

    /* compiled from: StateFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/statesandlgapicker/dialogs/StateFragment$Companion;", "", "()V", "ARGS_STATES", "", "ARG_HINT_TEXT", "newInstance", "Lai/kudi/agent/statesandlgapicker/dialogs/StateFragment;", "states", "", "hintText", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public static /* synthetic */ StateFragment newInstance$default(Companion companion, List list, String $r4, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r4 = "Search state";
            }
            StateFragment $r2 = companion.newInstance(list, $r4);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final StateFragment newInstance(List list, String str) {
            Log_OC.getArray(list, "states");
            Log_OC.getArray(str, "hintText");
            StateFragment $r4 = new StateFragment();
            Bundle $r2 = new Bundle();
            ArrayList $r5 = (ArrayList) list;
            $r2.putStringArrayList(StateFragment.ARGS_STATES, $r5);
            $r2.putString(StateFragment.ARG_HINT_TEXT, str);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r2);
            return $r4;
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
    public StateFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List getStates(java.util.ArrayList r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            ai.kudi.agent.register.data.models.DropDownModel r6 = new ai.kudi.agent.register.data.models.DropDownModel
            r6.<init>(r4)
            r0.add(r6)
            goto L9
        L20:
            int r7 = r0.size()
            r8 = 1
            if (r7 <= r8) goto L2f
            ai.kudi.agent.statesandlgapicker.dialogs.StateFragment$getStates$$inlined$sortBy$1 r9 = new ai.kudi.agent.statesandlgapicker.dialogs.StateFragment$getStates$$inlined$sortBy$1
            r9.<init>()
            kotlin.p557z.C13722p.m3912u(r0, r9)
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.statesandlgapicker.dialogs.StateFragment.getStates(java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final StateFragment newInstance(List list, String str) {
        Companion $r1 = Companion;
        StateFragment $r2 = $r1.newInstance(list, str);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40945onActivityCreated$lambda1$lambda0(StateFragment stateFragment, View view) {
        Log_OC.getArray(stateFragment, "this$0");
        stateFragment.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSearch() {
        FragmentPickerBinding $r2 = requireBinding();
        EditText $r3 = $r2.searchView;
        $r3.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.statesandlgapicker.dialogs.StateFragment$performSearch$1
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
                StateFragment $r22 = StateFragment.this;
                DropDownListAdapterUpdated $r32 = $r22.getLocationAdapter();
                String $r4 = String.valueOf(charSequence);
                StateFragment $r23 = StateFragment.this;
                StateFragment$performSearch$1$onTextChanged$1 $r5 = new StateFragment$performSearch$1$onTextChanged$1($r23);
                $r32.search($r4, $r5);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPickerBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPickerBinding $r3 = (FragmentPickerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPickerBinding $r1 = getBinding();
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
    public final DropDownListAdapterUpdated getLocationAdapter() {
        DropDownListAdapterUpdated $r1 = this.locationAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("locationAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPickerBinding fragmentPickerBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPickerBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPickerBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPickerBinding $r4 = (FragmentPickerBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Context $r3 = requireContext();
        LinearLayoutManager $r2 = new LinearLayoutManager($r3);
        FragmentPickerBinding $r4 = requireBinding();
        EditText $r5 = $r4.searchView;
        Bundle $r1 = getArguments();
        String $r6 = $r1 == null ? null : $r1.getString(ARG_HINT_TEXT);
        Log_OC.append($r6);
        $r5.setHint($r6);
        RecyclerView $r7 = $r4.recyclerView;
        $r7.setLayoutManager($r2);
        RecyclerView $r72 = $r4.recyclerView;
        Context $r32 = getContext();
        int $i0 = $r2.m35389v2();
        C1723k $r8 = new C1723k($r32, $i0);
        $r72.m35294h($r8);
        Bundle $r12 = getArguments();
        ArrayList $r10 = $r12 == null ? null : $r12.getStringArrayList(ARGS_STATES);
        Log_OC.append($r10);
        Log_OC.loadImage($r10, "arguments?.getStringArrayList(ARGS_STATES)!!");
        List $r11 = getStates($r10);
        DropDownListAdapterUpdated $r9 = new DropDownListAdapterUpdated($r11, false, 2, null);
        setLocationAdapter($r9);
        DropDownListAdapterUpdated.Companion $r122 = DropDownListAdapterUpdated.Companion;
        StateFragment$onActivityCreated$1$1 $r13 = new StateFragment$onActivityCreated$1$1(this);
        $r122.setClickedListener($r13);
        RecyclerView $r73 = $r4.recyclerView;
        DropDownListAdapterUpdated $r92 = getLocationAdapter();
        $r73.setAdapter($r92);
        performSearch();
        Toolbar $r14 = $r4.toolbar;
        $r14.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.statesandlgapicker.dialogs.CountdownFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StateFragment $r22 = StateFragment.this;
                StateFragment.m40945onActivityCreated$lambda1$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = C0038R.style.FullScreenDialogStyle;
        setStyle(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPickerBinding $r4 = FragmentPickerBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPickerBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPickerBinding $r3 = (FragmentPickerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPickerBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setCallback(InterfaceC11767l interfaceC11767l) {
        this.callback = interfaceC11767l;
    }

    public final void setLocationAdapter(DropDownListAdapterUpdated dropDownListAdapterUpdated) {
        Log_OC.getArray(dropDownListAdapterUpdated, "<set-?>");
        this.locationAdapter = dropDownListAdapterUpdated;
    }
}
