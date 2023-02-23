package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.users.data.network.UserService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import retrofit2.C14840l;
/* compiled from: FetchLocation.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/FetchLocation;", "", "network", "Lai/kudi/agent/users/data/network/UserService;", "(Lai/kudi/agent/users/data/network/UserService;)V", "getNetwork", "()Lai/kudi/agent/users/data/network/UserService;", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/register/data/models/LocationModel;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchLocation {
    private final UserService network;

    public FetchLocation(UserService userService) {
        Log_OC.getArray(userService, "network");
        this.network = userService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m40337execute$lambda0(C14840l c14840l) {
        ArrayList $r0;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 == 200) {
            Object $r2 = c14840l.m284a();
            Log_OC.append($r2);
            APIResponse $r3 = (APIResponse) $r2;
            List $r4 = (List) $r3.data;
            return $r4;
        }
        ArrayList $r02 = new ArrayList();
        LocationModel $r6 = new LocationModel("", "", $r02);
        LocationModel[] $r5 = {$r6};
        $r0 = C13726r.m3893c($r5);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute() {
        UserService $r1 = this.network;
        AbstractC11688p $r2 = $r1.getLocation();
        BigReal $r3 = BigReal.ZERO;
        AbstractC11688p $r22 = $r2.m10531O($r3);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r23 = $r22.h0($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r24 = $r23.R($r42);
        Log_OC.loadImage($r24, "network.getLocation()\n                .map {\n                    if (it.code() == 200) {\n                        it.body()!!.data\n                    } else {\n                        arrayListOf(LocationModel(\"\", \"\", arrayListOf()))\n                    }\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r24;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserService getNetwork() {
        UserService r1 = this.network;
        return r1;
    }
}
