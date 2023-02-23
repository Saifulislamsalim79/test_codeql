package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentMyDevicesBinding;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.adapters.MyDevicesAdapter;
import ai.kudi.agent.settings.security.p028ui.viewModels.MyDevicesViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.MyDevicesViewData;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: MyDevicesFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/MyDevicesFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/security/ui/viewModels/MyDevicesViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/MyDevicesViewData;", "Lai/kudi/agent/databinding/FragmentMyDevicesBinding;", "()V", "myDevicesAdapter", "Lai/kudi/agent/settings/ui/adapters/MyDevicesAdapter;", "myDevicesViewModel", "getMyDevicesViewModel", "()Lai/kudi/agent/settings/security/ui/viewModels/MyDevicesViewModel;", "setMyDevicesViewModel", "(Lai/kudi/agent/settings/security/ui/viewModels/MyDevicesViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.MyDevicesFragment */
/* loaded from: classes.dex */
public final class MyDevicesFragment extends BaseMVVMViewBindingFragment<MyDevicesViewModel, MyDevicesViewData, FragmentMyDevicesBinding> {
    public static final Companion Companion;
    private MyDevicesAdapter myDevicesAdapter;
    public MyDevicesViewModel myDevicesViewModel;

    /* compiled from: MyDevicesFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/MyDevicesFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/security/ui/MyDevicesFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.security.ui.MyDevicesFragment$Companion */
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
        public final MyDevicesFragment newInstance() {
            MyDevicesFragment $r1 = new MyDevicesFragment();
            Bundle $r2 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final MyDevicesFragment newInstance() {
        Companion $r1 = Companion;
        MyDevicesFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        MyDevicesViewData $r2 = (MyDevicesViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(MyDevicesViewData myDevicesViewData) {
        Log_OC.getArray(myDevicesViewData, "viewData");
        boolean $z0 = myDevicesViewData instanceof MyDevicesViewData.ShowLoading;
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentMyDevicesBinding $r3 = (FragmentMyDevicesBinding) $r2;
            ProgressBar $r4 = $r3.myDevicesProgressBar;
            Log_OC.loadImage($r4, "requireBinding().myDevicesProgressBar");
            ViewExtKt.show($r4);
            return;
        }
        boolean $z02 = myDevicesViewData instanceof MyDevicesViewData.DeviceDeleted;
        if ($z02) {
            MyDevicesAdapter $r5 = this.myDevicesAdapter;
            if ($r5 == null) {
                return;
            }
            MyDevicesViewData.DeviceDeleted $r6 = (MyDevicesViewData.DeviceDeleted) myDevicesViewData;
            int $i0 = $r6.getPosition();
            $r5.deleteItem($i0);
            return;
        }
        boolean $z03 = myDevicesViewData instanceof MyDevicesViewData.Devices;
        if (!$z03) {
            boolean $z04 = myDevicesViewData instanceof MyDevicesViewData.Error;
            if ($z04) {
                Context $r13 = requireContext();
                Log_OC.loadImage($r13, "requireContext()");
                MyDevicesViewData.Error $r14 = (MyDevicesViewData.Error) myDevicesViewData;
                String $r12 = $r14.getMessage();
                ContextExtKt.toast$default($r13, $r12, 0, 2, (Object) null);
                return;
            }
            boolean $z05 = myDevicesViewData instanceof MyDevicesViewData.FeedBackMessage;
            if ($z05) {
                Context $r132 = requireContext();
                Log_OC.loadImage($r132, "requireContext()");
                MyDevicesViewData.FeedBackMessage $r15 = (MyDevicesViewData.FeedBackMessage) myDevicesViewData;
                int $i02 = $r15.getFeedbackMessage();
                String $r122 = getString($i02);
                ContextExtKt.toast$default($r132, $r122, 0, 2, (Object) null);
                return;
            }
            MyDevicesViewData.HideLoading $r16 = MyDevicesViewData.HideLoading.INSTANCE;
            boolean $z06 = Log_OC.append(myDevicesViewData, $r16);
            if (!$z06) {
                MyDevicesViewData.Initial $r17 = MyDevicesViewData.Initial.INSTANCE;
                Log_OC.append(myDevicesViewData, $r17);
                return;
            }
            InterfaceC8209a $r22 = requireBinding();
            FragmentMyDevicesBinding $r32 = (FragmentMyDevicesBinding) $r22;
            ProgressBar $r42 = $r32.myDevicesProgressBar;
            Log_OC.loadImage($r42, "requireBinding().myDevicesProgressBar");
            ViewExtKt.hide$default($r42, false, 1, null);
            return;
        }
        MyDevicesViewData.Devices devices = (MyDevicesViewData.Devices) myDevicesViewData;
        List $r8 = devices.getDevices();
        boolean $z07 = $r8.isEmpty();
        if (!$z07) {
            MyDevicesAdapter $r52 = this.myDevicesAdapter;
            if ($r52 == null) {
                return;
            }
            List $r82 = devices.getDevices();
            $r52.setData($r82);
            return;
        }
        MyDevicesAdapter $r53 = this.myDevicesAdapter;
        if ($r53 == null) {
            return;
        }
        List $r83 = $r53.getItems();
        boolean $z08 = $r83.isEmpty();
        if ($z08) {
            InterfaceC8209a $r23 = requireBinding();
            FragmentMyDevicesBinding $r33 = (FragmentMyDevicesBinding) $r23;
            EmptyHistoryBinding $r9 = $r33.devicesEmptyHistory;
            View $r10 = $r9.getRoot();
            Log_OC.loadImage($r10, "requireBinding().devicesEmptyHistory.root");
            View r18 = $r10;
            ViewExtKt.show(r18);
            InterfaceC8209a $r24 = requireBinding();
            FragmentMyDevicesBinding $r34 = (FragmentMyDevicesBinding) $r24;
            EmptyHistoryBinding $r92 = $r34.devicesEmptyHistory;
            TextView $r11 = $r92.emptyHistoryTextView;
            CharSequence $r123 = getString(C0001R.string.empty_trusted_devices_text);
            TextView r19 = $r11;
            r19.setText($r123);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        MyDevicesViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public MyDevicesViewModel createViewModel() {
        MyDevicesViewModel $r1 = getMyDevicesViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MyDevicesViewModel getMyDevicesViewModel() {
        MyDevicesViewModel $r1 = this.myDevicesViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("myDevicesViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return MyDevicesViewModel.class;
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
        FragmentMyDevicesBinding $r4 = FragmentMyDevicesBinding.inflate(layoutInflater, viewGroup, false);
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
        String $r3 = getString(C0001R.string.my_devices);
        Log_OC.loadImage($r3, "getString(R.string.my_devices)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        MyDevicesAdapter $r4 = new MyDevicesAdapter();
        this.myDevicesAdapter = $r4;
        InterfaceC8209a $r5 = requireBinding();
        FragmentMyDevicesBinding $r6 = (FragmentMyDevicesBinding) $r5;
        RecyclerView $r7 = $r6.myDevicesRv;
        MyDevicesAdapter $r42 = this.myDevicesAdapter;
        $r7.setAdapter($r42);
        MyDevicesAdapter $r43 = this.myDevicesAdapter;
        if ($r43 != null) {
            MyDevicesFragment$onViewCreated$1 $r8 = new MyDevicesFragment$onViewCreated$1(this);
            $r43.setOnDeleteClickListener($r8);
        }
        MyDevicesViewModel $r9 = getMyDevicesViewModel();
        $r9.fetchDevices();
    }

    public final void setMyDevicesViewModel(MyDevicesViewModel myDevicesViewModel) {
        Log_OC.getArray(myDevicesViewModel, "<set-?>");
        this.myDevicesViewModel = myDevicesViewModel;
    }
}
