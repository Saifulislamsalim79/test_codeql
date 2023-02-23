package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.NoInputUseCase;
import ai.kudi.agent.network.exceptions.NotFoundException;
import ai.kudi.agent.pos.data.PosDeviceInfoModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetPosDeviceInfo.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/pos/usecases/GetPosDeviceInfo;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "", "Lai/kudi/agent/pos/data/PosDeviceInfoModel;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetPosDeviceInfo implements NoInputUseCase<List<? extends PosDeviceInfoModel>> {
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;

    public GetPosDeviceInfo(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.fetchCurrentUser = fetchCurrentUser;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, T] */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m40115execute$lambda0(C11812w c11812w, User user) {
        ?? m3783o0;
        ?? m3783o02;
        ?? m3783o03;
        ?? m3783o04;
        Log_OC.getArray(c11812w, "$posDeviceInfoList");
        Log_OC.getArray(user, "user");
        String $r2 = user.getTerminalId();
        if ($r2 == null) {
            NotFoundException $r9 = new NotFoundException("Terminal Id not found");
            throw $r9;
        }
        Object $r3 = c11812w.f26499c;
        Collection $r4 = (Collection) $r3;
        String $r6 = user.getPosDeviceName();
        String $r7 = $r6;
        if ($r6 == null) {
            $r7 = "---";
        }
        PosDeviceInfoModel $r5 = new PosDeviceInfoModel(C0001R.C0002drawable.ic_terminal, "Device Name", $r7);
        m3783o0 = C13742z.m3783o0($r4, $r5);
        c11812w.f26499c = m3783o0;
        Collection $r42 = (Collection) m3783o0;
        String $r62 = user.getSerialNumber();
        String $r72 = $r62;
        if ($r62 == null) {
            $r72 = "---";
        }
        PosDeviceInfoModel $r52 = new PosDeviceInfoModel(C0001R.C0002drawable.ic_serial_24px, "Serial Number", $r72);
        m3783o02 = C13742z.m3783o0($r42, $r52);
        c11812w.f26499c = m3783o02;
        Collection $r43 = (Collection) m3783o02;
        String $r63 = user.getTerminalId();
        String $r73 = $r63;
        if ($r63 == null) {
            $r73 = "---";
        }
        PosDeviceInfoModel $r53 = new PosDeviceInfoModel(C0001R.C0002drawable.ic_baseline_file_copy_24px, TransactionField.TERMINAL_ID, $r73);
        m3783o03 = C13742z.m3783o0($r43, $r53);
        c11812w.f26499c = m3783o03;
        Collection $r44 = (Collection) m3783o03;
        String $r64 = user.getMposVendor();
        String $r22 = $r64 != null ? $r64 : "---";
        PosDeviceInfoModel $r54 = new PosDeviceInfoModel(C0001R.C0002drawable.ic_bank, "Bank Vendor", $r22);
        m3783o04 = C13742z.m3783o0($r44, $r54);
        c11812w.f26499c = m3783o04;
        List $r8 = (List) m3783o04;
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, T] */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        ?? m3891e;
        final C11812w $r1 = new C11812w();
        m3891e = C13726r.m3891e();
        $r1.f26499c = m3891e;
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10437m(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.usecases.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r12 = C11812w.this;
                User $r42 = (User) obj;
                List $r2 = GetPosDeviceInfo.m40115execute$lambda0($r12, $r42);
                return $r2;
            }
        }).m10427w();
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        AbstractC11688p $r62 = $r6.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        p425j.p444e.Item $r82 = $r72.main();
        AbstractC11688p $r63 = $r62.R($r82);
        Log_OC.loadImage($r63, "fetchCurrentUser.execute().map { user ->\n            if (user.terminalId == null) {\n                throw NotFoundException(\"Terminal Id not found\")\n            }\n            posDeviceInfoList = posDeviceInfoList.plus(\n                PosDeviceInfoModel(\n                    R.drawable.ic_terminal,\n                    \"Device Name\",\n                    user.posDeviceName ?: \"---\"\n                )\n            )\n            posDeviceInfoList = posDeviceInfoList.plus(\n                PosDeviceInfoModel(\n                    R.drawable.ic_serial_24px,\n                    \"Serial Number\",\n                    user.serialNumber ?: \"---\"\n                )\n            )\n            posDeviceInfoList = posDeviceInfoList.plus(\n                PosDeviceInfoModel(\n                    R.drawable.ic_baseline_file_copy_24px,\n                    \"Terminal ID\",\n                    user.terminalId ?: \"---\"\n                )\n            )\n            posDeviceInfoList = posDeviceInfoList.plus(\n                PosDeviceInfoModel(\n                    R.drawable.ic_bank,\n                    \"Bank Vendor\",\n                    user.mposVendor ?: \"---\"\n                )\n            )\n            posDeviceInfoList\n        }.toObservable().subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r63;
    }
}
