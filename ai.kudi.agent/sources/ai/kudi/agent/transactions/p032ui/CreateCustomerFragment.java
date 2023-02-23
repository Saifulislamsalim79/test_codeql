package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentCreateCustomerBinding;
import ai.kudi.agent.transactions.presenters.CreateCustomerPresenter;
import ai.kudi.agent.transactions.views.CreateCustomerView;
import ai.kudi.dip.library.button.C0770i;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p267w.p268a.p269a.C8199i;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateCustomerFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001;B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\t\u0010-\u001a\u00020\u0005H\u0096\u0001J\b\u0010.\u001a\u00020\u001aH\u0016J\u0018\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000bH\u0016J\u001c\u00103\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u000bH\u0016J\b\u00107\u001a\u00020\u001aH\u0016J\u0010\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006<"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/CreateCustomerFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/transactions/views/CreateCustomerView;", "Lai/kudi/agent/transactions/presenters/CreateCustomerPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentCreateCustomerBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentCreateCustomerBinding;", "customerId", "", "customerName", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/CreateCustomerPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/CreateCustomerPresenter;)V", "createPresenter", "hideAddCustomerLoader", "", "hideLookupLoader", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "showAddCustomerLoader", "showAddCustomerSuccessful", "isANewCustomer", "", "name", "showCustomerName", "id", "showError", "errorMessage", "showLookupLoader", "showNameError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showPhoneNumberError", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.CreateCustomerFragment */
/* loaded from: classes.dex */
public final class CreateCustomerFragment extends MvpFragment<CreateCustomerView, CreateCustomerPresenter> implements CreateCustomerView, BaseViewBinder<FragmentCreateCustomerBinding> {
    private static final String ARGS_TRANSACTION_REF = "args_transaction_ref";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentCreateCustomerBinding> $$delegate_0;
    private String customerId;
    private String customerName;
    public FavoritesArrayAdapter disposable;
    public CreateCustomerPresenter thisPresenter;

    /* compiled from: CreateCustomerFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/CreateCustomerFragment$Companion;", "", "()V", "ARGS_TRANSACTION_REF", "", "newInstance", "Lai/kudi/agent/transactions/ui/CreateCustomerFragment;", "transactionRef", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.CreateCustomerFragment$Companion */
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
        public final CreateCustomerFragment newInstance(String str) {
            CreateCustomerFragment r5 = new CreateCustomerFragment();
            Bundle r6 = new Bundle();
            r6.putString(CreateCustomerFragment.ARGS_TRANSACTION_REF, str);
            C13666w c13666w = C13666w.f30112a;
            CreateCustomerFragment r7 = r5;
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
    public CreateCustomerFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-0  reason: not valid java name */
    public static final void m41214onViewCreated$lambda3$lambda0(CreateCustomerFragment createCustomerFragment, FragmentCreateCustomerBinding fragmentCreateCustomerBinding, View view) {
        Log_OC.getArray(createCustomerFragment, "this$0");
        Log_OC.getArray(fragmentCreateCustomerBinding, "$this_apply");
        CreateCustomerFragment r9 = createCustomerFragment;
        Bundle $r3 = r9.requireArguments();
        String $r4 = $r3.getString(ARGS_TRANSACTION_REF);
        Log_OC.append($r4);
        Log_OC.loadImage($r4, "requireArguments().getString(ARGS_TRANSACTION_REF)!!");
        String $r5 = createCustomerFragment.customerId;
        if ($r5 == null) {
            CreateCustomerPresenter $r6 = createCustomerFragment.getThisPresenter();
            KudiInputField $r8 = fragmentCreateCustomerBinding.textPhoneNumber;
            String $r52 = $r8.getText();
            KudiInputField $r82 = fragmentCreateCustomerBinding.textFullName;
            $r6.createCustomer($r52, $r82.getText(), $r4);
            return;
        }
        CreateCustomerPresenter $r62 = createCustomerFragment.getThisPresenter();
        String $r53 = createCustomerFragment.customerId;
        Log_OC.append($r53);
        String $r7 = createCustomerFragment.customerName;
        Log_OC.append($r7);
        $r62.assignCustomerToTransaction($r53, $r7, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* renamed from: onViewCreated$lambda-3$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41215onViewCreated$lambda3$lambda1(ai.kudi.agent.databinding.FragmentCreateCustomerBinding r12, ai.kudi.agent.transactions.p032ui.CreateCustomerFragment r13, java.lang.CharSequence r14) {
        /*
            java.lang.String r0 = "$this_apply"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            ai.kudi.dip.library.edittext.KudiInputField r1 = r12.textPhoneNumber
            if (r1 != 0) goto L10
            r2 = 0
            goto L14
        L10:
            java.lang.String r2 = r1.getText()
        L14:
            if (r2 != 0) goto L18
        L16:
            r3 = 0
            goto L21
        L18:
            int r4 = r2.length()
            r5 = 11
            if (r4 != r5) goto L16
            r3 = 1
        L21:
            if (r3 == 0) goto L2b
            ai.kudi.agent.transactions.presenters.CreateCustomerPresenter r6 = r13.getThisPresenter()
            r6.lookupCustomer(r2)
            return
        L2b:
            ai.kudi.dip.library.button.KudiButton r7 = r12.buttonAddCustomer
            java.lang.String r0 = "buttonAddCustomer"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r0)
            r9 = r7
            android.view.View r9 = (android.view.View) r9
            r8 = r9
            r5 = 0
            r10 = 1
            r11 = 0
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r8, r5, r10, r11)
            ai.kudi.dip.library.edittext.KudiInputField r1 = r12.textFullName
            r5 = 0
            r1.setEditable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.CreateCustomerFragment.m41215onViewCreated$lambda3$lambda1(ai.kudi.agent.databinding.FragmentCreateCustomerBinding, ai.kudi.agent.transactions.ui.CreateCustomerFragment, java.lang.CharSequence):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41216onViewCreated$lambda3$lambda2(Throwable th) {
        th.printStackTrace();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public CreateCustomerPresenter createPresenter() {
        CreateCustomerPresenter $r1 = getThisPresenter();
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
    public FragmentCreateCustomerBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentCreateCustomerBinding $r3 = (FragmentCreateCustomerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentCreateCustomerBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter getDisposable() {
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("disposable");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CreateCustomerPresenter getThisPresenter() {
        CreateCustomerPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void hideAddCustomerLoader() {
        FragmentCreateCustomerBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.buttonAddCustomer;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void hideLookupLoader() {
        FragmentCreateCustomerBinding $r1 = requireBinding();
        ImageView $r2 = $r1.imageCustomerLoader;
        Log_OC.loadImage($r2, "requireBinding().imageCustomerLoader");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentCreateCustomerBinding fragmentCreateCustomerBinding, Fragment fragment) {
        Log_OC.getArray(fragmentCreateCustomerBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentCreateCustomerBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentCreateCustomerBinding $r4 = (FragmentCreateCustomerBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        CreateCustomerFragment r5 = this;
        super.onAttach(context);
        BaseApplication.Companion $r2 = BaseApplication.Companion;
        BaseApplication $r3 = $r2.getApplication();
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CreateCustomerFragment r2 = this;
        r2.setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCreateCustomerBinding $r4 = FragmentCreateCustomerBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        CreateCustomerFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        final FragmentCreateCustomerBinding $r3 = requireBinding();
        KudiInputField $r4 = $r3.textFullName;
        $r4.setEditable(false);
        ViewGroup $r5 = $r3.buttonAddCustomer;
        ViewGroup r13 = $r5;
        r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreateCustomerFragment $r2 = CreateCustomerFragment.this;
                FragmentCreateCustomerBinding $r32 = $r3;
                CreateCustomerFragment.m41214onViewCreated$lambda3$lambda0($r2, $r32, view2);
            }
        });
        KudiInputField $r42 = $r3.textPhoneNumber;
        EditText $r7 = $r42.getEditText();
        AbstractC11688p $r8 = EditTextExtKt.getTextChanges($r7);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.ui.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentCreateCustomerBinding $r1 = FragmentCreateCustomerBinding.this;
                CreateCustomerFragment $r2 = this;
                CharSequence $r43 = (CharSequence) obj;
                CreateCustomerFragment.m41215onViewCreated$lambda3$lambda1($r1, $r2, $r43);
            }
        };
        C0624b $r10 = C0624b.f1717e;
        $r8.e0(object, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCreateCustomerBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentCreateCustomerBinding $r3 = (FragmentCreateCustomerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentCreateCustomerBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setDisposable(FavoritesArrayAdapter favoritesArrayAdapter) {
        Log_OC.getArray(favoritesArrayAdapter, "<set-?>");
        this.disposable = favoritesArrayAdapter;
    }

    public final void setThisPresenter(CreateCustomerPresenter createCustomerPresenter) {
        Log_OC.getArray(createCustomerPresenter, "<set-?>");
        this.thisPresenter = createCustomerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void showAddCustomerLoader() {
        FragmentCreateCustomerBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.buttonAddCustomer;
        $r2.m38032f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void showAddCustomerSuccessful(boolean z, String str) {
        Log_OC.getArray(str, "name");
        CreateCustomerFragment r6 = this;
        FragmentActivity $r1 = r6.getActivity();
        if ($r1 == null) {
            NullPointerException r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transactions.ui.TransactionDetailsActionActivity");
            throw r5;
        }
        TransactionDetailsActionActivity $r3 = (TransactionDetailsActionActivity) $r1;
        $r3.navigateToStatusPage(z, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showCustomerName(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            ai.kudi.agent.databinding.FragmentCreateCustomerBinding r0 = r10.requireBinding()
            r10.customerId = r11
            r10.customerName = r12
            ai.kudi.dip.library.edittext.KudiInputField r1 = r0.textFullName
            r1.setText(r12)
            ai.kudi.dip.library.button.KudiButton r2 = r0.buttonAddCustomer
            java.lang.String r3 = "buttonAddCustomer"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r3)
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            r4 = r5
            ai.kudi.agent.core.util.ViewExtKt.show(r4)
            if (r11 == 0) goto L26
            int r6 = r11.length()
            if (r6 != 0) goto L24
            goto L26
        L24:
            r7 = 0
            goto L27
        L26:
            r7 = 1
        L27:
            if (r7 == 0) goto L38
            ai.kudi.dip.library.edittext.KudiInputField r1 = r0.textFullName
            r8 = 1
            r1.setEditable(r8)
            ai.kudi.dip.library.edittext.KudiInputField r1 = r0.textFullName
            android.widget.EditText r9 = r1.getEditText()
            r9.requestFocus()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.CreateCustomerFragment.showCustomerName(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void showError(String str) {
        Log_OC.getArray(str, "errorMessage");
        Object[] $r2 = new Object[0];
        Timber.m1627e(str, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void showLookupLoader() {
        FragmentCreateCustomerBinding $r1 = requireBinding();
        CreateCustomerFragment r10 = this;
        Resources $r2 = r10.getResources();
        C8199i $r3 = C8199i.m16520b($r2, C0001R.C0002drawable.ic_spin, null);
        Log_OC.append($r3);
        CreateCustomerFragment r102 = this;
        Context $r4 = r102.requireContext();
        int $i0 = C1335a.m36324d($r4, C0001R.color.kudiButtonDrawableColor);
        C1365a.m36188n($r3, $i0);
        C0770i r9 = new C0770i($r3);
        r9.m38010c(360.0f, 1000L);
        C0770i r11 = r9;
        $r1.imageCustomerLoader.setImageDrawable(r11);
        ImageView $r6 = $r1.imageCustomerLoader;
        Log_OC.loadImage($r6, "imageCustomerLoader");
        ViewExtKt.show($r6);
        View $r7 = $r1.buttonAddCustomer;
        Log_OC.loadImage($r7, "buttonAddCustomer");
        View r12 = $r7;
        ViewExtKt.hide$default(r12, false, 1, null);
        KudiInputField $r8 = $r1.textFullName;
        $r8.setEditable(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void showNameError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentCreateCustomerBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.textFullName;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.CreateCustomerView
    public void showPhoneNumberError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentCreateCustomerBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.textPhoneNumber;
        $r3.setError(str);
    }
}
