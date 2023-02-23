package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.domain.useCases.DeleteDevice;
import ai.kudi.agent.settings.domain.useCases.GetDevices;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.MyDevicesViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: MyDevicesViewModel.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/viewModels/MyDevicesViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/MyDevicesViewData;", "getDevices", "Lai/kudi/agent/settings/domain/useCases/GetDevices;", "deleteDevice", "Lai/kudi/agent/settings/domain/useCases/DeleteDevice;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/settings/domain/useCases/GetDevices;Lai/kudi/agent/settings/domain/useCases/DeleteDevice;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "", "deviceId", "", "position", "", "fetchDevices", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.MyDevicesViewModel */
/* loaded from: classes.dex */
public final class MyDevicesViewModel extends BaseViewModel<MyDevicesViewData> {
    private final DeleteDevice deleteDevice;
    private final FetchCurrentUser fetchCurrentUser;
    private final GetDevices getDevices;

    public MyDevicesViewModel(GetDevices getDevices, DeleteDevice deleteDevice, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(getDevices, "getDevices");
        Log_OC.getArray(deleteDevice, "deleteDevice");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.getDevices = getDevices;
        this.deleteDevice = deleteDevice;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deleteDevice$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m40885deleteDevice$lambda3(MyDevicesViewModel myDevicesViewModel, String str, User user) {
        Log_OC.getArray(myDevicesViewModel, "this$0");
        Log_OC.getArray(str, "$deviceId");
        Log_OC.getArray(user, "it");
        DeleteDevice $r3 = myDevicesViewModel.deleteDevice;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, str);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deleteDevice$lambda-4  reason: not valid java name */
    public static final void m40886deleteDevice$lambda4(MyDevicesViewModel myDevicesViewModel, int i, Object obj) {
        Log_OC.getArray(myDevicesViewModel, "this$0");
        MyDevicesViewData.HideLoading $r2 = MyDevicesViewData.HideLoading.INSTANCE;
        myDevicesViewModel.publish($r2);
        MyDevicesViewData.FeedBackMessage $r3 = new MyDevicesViewData.FeedBackMessage(C0001R.string.device_deleted);
        myDevicesViewModel.publish($r3);
        MyDevicesViewData.DeviceDeleted $r4 = new MyDevicesViewData.DeviceDeleted(i);
        myDevicesViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deleteDevice$lambda-5  reason: not valid java name */
    public static final void m40887deleteDevice$lambda5(MyDevicesViewModel myDevicesViewModel, Throwable th) {
        Log_OC.getArray(myDevicesViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        MyDevicesViewData.Error $r2 = new MyDevicesViewData.Error($r5);
        myDevicesViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDevices$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40888fetchDevices$lambda0(MyDevicesViewModel myDevicesViewModel, User user) {
        Log_OC.getArray(myDevicesViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetDevices $r2 = myDevicesViewModel.getDevices;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDevices$lambda-1  reason: not valid java name */
    public static final void m40889fetchDevices$lambda1(MyDevicesViewModel myDevicesViewModel, List list) {
        Log_OC.getArray(myDevicesViewModel, "this$0");
        MyDevicesViewData.HideLoading $r2 = MyDevicesViewData.HideLoading.INSTANCE;
        myDevicesViewModel.publish($r2);
        Log_OC.loadImage(list, "it");
        MyDevicesViewData.Devices $r3 = new MyDevicesViewData.Devices(list);
        myDevicesViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDevices$lambda-2  reason: not valid java name */
    public static final void m40890fetchDevices$lambda2(MyDevicesViewModel myDevicesViewModel, Throwable th) {
        Log_OC.getArray(myDevicesViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        MyDevicesViewData.Error $r2 = new MyDevicesViewData.Error($r5);
        myDevicesViewModel.publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void deleteDevice(final String str, final int i) {
        Log_OC.getArray(str, "deviceId");
        MyDevicesViewData.ShowLoading $r2 = MyDevicesViewData.ShowLoading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.security.ui.viewModels.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                MyDevicesViewModel $r1 = MyDevicesViewModel.this;
                String $r22 = str;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = MyDevicesViewModel.m40885deleteDevice$lambda3($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.DynamicTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MyDevicesViewModel $r22 = MyDevicesViewModel.this;
                int $i0 = i;
                MyDevicesViewModel.m40886deleteDevice$lambda4($r22, $i0, obj);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MyDevicesViewModel $r1 = MyDevicesViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MyDevicesViewModel.m40887deleteDevice$lambda5($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchDevices() {
        MyDevicesViewData.ShowLoading $r1 = MyDevicesViewData.ShowLoading.INSTANCE;
        publish($r1);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.security.ui.viewModels.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                MyDevicesViewModel $r12 = MyDevicesViewModel.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = MyDevicesViewModel.m40888fetchDevices$lambda0($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MyDevicesViewModel $r12 = MyDevicesViewModel.this;
                List $r32 = (List) obj;
                MyDevicesViewModel.m40889fetchDevices$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MyDevicesViewModel $r12 = MyDevicesViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MyDevicesViewModel.m40890fetchDevices$lambda2($r12, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        MyDevicesViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public MyDevicesViewData initialData() {
        MyDevicesViewData.Initial r1 = MyDevicesViewData.Initial.INSTANCE;
        return r1;
    }
}
