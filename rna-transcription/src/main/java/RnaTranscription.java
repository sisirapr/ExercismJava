class RnaTranscription {

    String transcribe(String dnaStrand) {
        int len=dnaStrand.length();
        char[] rna=new char[len];
        int i=0;
        for(char a:dnaStrand.toCharArray()){
            if(a=='G')
                rna[i++]='C';
            else if(a=='C')
                rna[i++]='G';
            else if(a=='T')
                rna[i++]='A';
            else
                rna[i++]='U';
        }
        return String.valueOf(rna);
    }

}
