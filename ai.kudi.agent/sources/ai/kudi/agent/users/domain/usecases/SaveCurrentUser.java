package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.User;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* loaded from: classes.dex */
public class SaveCurrentUser implements OneInputUseCase<User, User> {
    private UserRepository userRepository;

    public SaveCurrentUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.users.domain.package_1.User user) {
        UserRepository $r2 = this.userRepository;
        AbstractC11688p $r3 = $r2.updateUser(user);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        return $r32.R($r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.users.domain.package_1.User $r3 = (ai.kudi.agent.users.domain.package_1.User) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
