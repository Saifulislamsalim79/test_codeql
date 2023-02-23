package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import java.io.PrintStream;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchCurrentUser.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Single;", "Lai/kudi/agent/users/domain/dto/User;", "io", "Lio/reactivex/Scheduler;", "main", "getIoScheduler", "getMainScheduler", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchCurrentUser {
    private final UserRepository userRepository;

    public FetchCurrentUser(UserRepository userRepository) {
        Log_OC.getArray(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AbstractC11696w execute$default(FetchCurrentUser fetchCurrentUser, p425j.p444e.Item $r1, p425j.p444e.Item $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = fetchCurrentUser.getIoScheduler();
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = fetchCurrentUser.getMainScheduler();
        }
        AbstractC11696w $r4 = fetchCurrentUser.execute($r1, $r2);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w execute(p425j.p444e.Item item, p425j.p444e.Item item2) {
        Log_OC.getArray(item, "io");
        Log_OC.getArray(item2, "main");
        String $r4 = item.toString();
        PrintStream $r1 = System.out;
        $r1.println((Object) $r4);
        UserRepository $r5 = this.userRepository;
        AbstractC11696w $r6 = $r5.getCurrentUser().u(item).n(item2);
        Log_OC.loadImage($r6, "userRepository.currentUser\n            .subscribeOn(io)\n            .observeOn(main)");
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final p425j.p444e.Item getIoScheduler() {
        p425j.p444e.Item $r1 = p425j.p444e.p470j0.ClassWriter.LogError();
        Log_OC.loadImage($r1, "io()");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final p425j.p444e.Item getMainScheduler() {
        p425j.p444e.Item $r1 = ContextUtils.LogError();
        Log_OC.loadImage($r1, "mainThread()");
        return $r1;
    }
}
