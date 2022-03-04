package ru.obvilion.api.inject.permissions.pex;

import ru.obvilion.api.inject.permissions.api.IGroup;
import ru.obvilion.api.inject.permissions.api.IPrefix;
import ru.obvilion.api.inject.permissions.api.ISuffix;
import ru.obvilion.api.inject.permissions.api.IUser;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class PexUser implements IUser {
    PermissionUser user;

    public PexUser(PermissionUser user) {
        this.user = user;
    }
    public PexUser(UUID user) {
        this.user = PermissionsEx.getPermissionManager().getUser(user);
    }
    public PexUser(String user) {
        this.user = PermissionsEx.getPermissionManager().getUser(user);
    }

    public List<IGroup> getGroups() {
        return user.getParentIdentifiers().stream().map(PexGroup::new).collect(Collectors.toList());
    }

    public IGroup getPrimaryGroup() {
        List<String> all = user.getParentIdentifiers();
        return all.size() > 0 ? new PexGroup(all.get(all.size() - 1)) : null;
    }

    public List<IPrefix> getOwnPrefixes() {
        List<IPrefix> all = new ArrayList<>();
        all.add(new PexPrefix(user.getOwnPrefix()));

        return all;
    }

    @Override
    public ArrayList<ISuffix> getOwnSuffixes() {
        return null;
    }

    @Override
    public IPrefix getOwnPrefix() {
        return null;
    }

    @Override
    public ISuffix getOwnSuffix() {
        return null;
    }

    @Override
    public IPrefix editOwnPrefix(IPrefix from, String prefix, long expiry) {
        return null;
    }

    @Override
    public ISuffix editOwnSuffix(ISuffix from, String prefix, long expiry) {
        return null;
    }

    @Override
    public void removeOwnPrefix(IPrefix prefix) {

    }

    @Override
    public void removeOwnSuffix(ISuffix suffix) {

    }

    @Override
    public void save() {

    }

    @Override
    public boolean hasPermission(String permission) {
        return false;
    }

    @Override
    public boolean addPermission(String permission) {
        return false;
    }

    @Override
    public boolean addPermission(String permission, long expiry) {
        return false;
    }

    @Override
    public void removePermission(String permission) {

    }
}