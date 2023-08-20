switch(v.getId()){
        case R.id.btnN1:
        displayATM("1");
        break;
        case R.id.btnN2:
        displayATM("2");
        break;
        case R.id.btnN3:
        displayATM("3");
        break;
        case R.id.btnN4:
        displayATM("4");
        break;
        case R.id.btnN5:
        displayATM("5");
        break;
        case R.id.btnN6:
        displayATM("6");
        break;
        case R.id.btnN7:
        displayATM("7");
        break;
        case R.id.btnN8:
        displayATM("8");
        break;
        case R.id.btnN9:
        displayATM("9");
        break;
        case R.id.btnBack:
        String str = edtATM.getText().toString();
        if(str.length()>0){
        str = str.substring(0, str.length()-1);
        edtATM.setText(str);
        }
        break;
        case R.id.btnOK:
        str = edtATM.getText().toString();
        if(str.equals("123456")) {
        Toast toast = Toast.makeText(MainActivity.this,"正確!",Toast.LENGTH_LONG);
        toast.show();}
        else {
        Toast toast = Toast.makeText(MainActivity.this,"錯誤!",Toast.LENGTH_SHORT);
        toast.show();
        edtATM.setText("");
        }
        break;
        case R.id.btnEnd:
        new AlertDialog.Builder(MainActivity.this)
        .setTitle("確認視窗")
        .setMessage("確定要結束嗎?")
        .setIcon(R.mipmap.ic_launcher)
        .show();
        break;
        }