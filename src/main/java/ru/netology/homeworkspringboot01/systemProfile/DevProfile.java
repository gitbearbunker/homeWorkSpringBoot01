package ru.netology.homeworkspringboot01.systemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}