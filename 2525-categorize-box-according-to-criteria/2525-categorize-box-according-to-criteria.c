char* categorizeBox(int length, int width, int height, int mass) {
    long long volume=(long long)length*width*height;
    bool isBulky = volume>=1000000000 || (length>=10000||width>=10000||height>=10000);
    bool isHeavy = mass>=100;
    if(isHeavy&&isBulky) return "Both";
    if(isHeavy) return "Heavy";
    if(isBulky) return "Bulky";
    return "Neither";
}