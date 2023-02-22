package coe                 replaceFragment(new VideoFragment());
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.tools:
                       replaceFragment(new ToolFragment());
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }


                return true;
            }
        });
    }
    void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();

    }
}