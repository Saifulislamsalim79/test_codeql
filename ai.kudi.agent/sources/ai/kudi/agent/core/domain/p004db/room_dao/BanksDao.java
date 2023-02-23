package ai.kudi.agent.core.domain.p004db.room_dao;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: BanksDao.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\nH'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/BanksDao;", "", "deleteBanks", "", "getBankByCode", "Lio/reactivex/Single;", "Lai/kudi/agent/core/domain/room_entities/Bank;", "bankCode", "", "getBanks", "Lio/reactivex/Observable;", "", "insertBanks", AttributeType.LIST, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.BanksDao */
/* loaded from: classes.dex */
public interface BanksDao {
    void deleteBanks();

    AbstractC11696w getBankByCode(String str);

    AbstractC11688p getBanks();

    void insertBanks(List list);
}
